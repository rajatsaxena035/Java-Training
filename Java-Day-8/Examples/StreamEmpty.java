import java.util.*;

class StreamEmpty
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("Java","","","great", "", "?", "");
		long cnt = list.stream().filter(s -> s.equals("")).count();
		System.out.println(cnt);
	}
}