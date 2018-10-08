class Singleton
{
	private static Singleton single_instance = null;
	public String s;
	private Singleton()
	{
		s = "dededfefem erf erferfe";
	}

	public static Singleton getInstance()
	{
		if(single_instance == null)
		{
			single_instance = new Singleton();
		}

		return single_instance;
	}
}

class Main
{
	public static void main(String[] args)
	{
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
	
		x.s = (x.s).toUpperCase();

		System.out.println("String from x is " + x.s);
		System.out.println("String from y is " + x.y);
		System.out.println("String from z is " + x.z);

		System.out.println("\n");
		z.s = (z.s).toLowerCase();

		System.out.println("String from x is " + x.s);
		System.out.println("String from y is " + x.s);
		System.out.println("String from z is " + x.s);
	}
}