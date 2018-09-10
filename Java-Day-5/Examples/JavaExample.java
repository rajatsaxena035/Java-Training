import java.util.*;
class JavaExample
{
	public static void main(String args[])
	{
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("a");
		alist.add("b");
		alist.add("c");
		alist.add("b");
		alist.remove("b");
		System.out.println(alist);
	}
}