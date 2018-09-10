import java.util.*;

class LetterA3
{
	public static void main(String[] args)
	{
		List<String> ls = new List<String>();
		ls.add("a");
		ls.add("ab");
		ls.add("abc");
		ls.add("abcd");
		ls.add("axz");
		ls.add("axzy");

		List<String> ls_new = find_a3(ls);
		ls_new.forEach(str -> System.out.println(str));
	}

	public List<String> find_a3(List<String> ls2)
	{
		return ls2.stream().filter(str -> (str.startsWith('a')) && (str.length() == 3) );
	}
}