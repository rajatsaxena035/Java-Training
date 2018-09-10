interface abc
{
	public static void main(String... args)
	{
		System.out.println("interface");
	}
}

class xyz implements abc
{
	public static void main(String[] args)
	{	
		System.out.println("class");
	}
}

class _123
{
	public static void main(String... args)
	{
		 abc a = new xyz();
		a.main(args);
	}
}