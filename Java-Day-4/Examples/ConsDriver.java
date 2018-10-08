class Cons
{
	String Cons()
	{
		System.out.println("abcd");
		return "a";
	}
}

class ConsDriver
{
	public static void main(String[] arg)
	{
		Cons c = new Cons();
		c.Cons();
	}
}