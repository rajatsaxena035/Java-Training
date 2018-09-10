import java.util.*;

class LetterA3
{
	public static void main(String[] args)
	{
		List<String> ls = new ArrayList<String>();
		ls.add("a");
		ls.add("ab");
		ls.add("abc");
		ls.add("abcd");
		ls.add("axz");
		ls.add("axzy");

		List<String> ls_new = find_a3(ls);
		ls_new.forEach(str -> System.out.println(str));
	}

	public static List<String> find_a3(List<String> ls2)
	{
		return ls2.stream().filter(str -> str.startsWith('a')).filter(str.length() == 3) ;
	}
}