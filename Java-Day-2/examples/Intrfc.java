interface Printable
{
	void print();
}

interface Showable extends Printable
{
	void show();
}

class Intrfc implements Showable
{
	public void print()
	{
		System.out.println("PRINT");
	}

	public void show()
	{
		System.out.println("SHOW");
	}

	public static void main(String[] args)
	{
		Intrfc i = new Intrfc();
		i.print();
		i.show();		
	}
}
