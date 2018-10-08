class Palindrome
{
	public static void main(String args[])
	{
		StringBuilder a = new StringBuilder("abcba");
		StringBuilder b = new StringBuilder("abcba");
		b.reverse();
		System.out.println(a);
		System.out.println(b);
		if(a.toString().equals(b.toString()))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}