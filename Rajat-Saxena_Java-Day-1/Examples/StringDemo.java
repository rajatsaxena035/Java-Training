public class StringDemo
{
	public static void main(String args[])
	{
		char[] helloArray = {'H','e','l','l','o'};
		String s = new String(helloArray);
		System.out.println(s);
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s);

		s = "Sachin   ";
		System.out.println(s);
		System.out.println(s.trim());

		s = "Sachin";
		System.out.println(s.startsWith());
		System.out.println(s.endsWith());
		System.out.println(s.charAt(3));
		System.out.println(s.length());
	}
}