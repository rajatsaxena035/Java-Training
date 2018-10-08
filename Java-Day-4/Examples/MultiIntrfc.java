interface Printable
{
	void print();
}

interface Printable2
{
	void show();
}

interface Showable extends Printable, Printable2
{
	void show();
}

class MultiIntrfc implements Showable
{
	public void print()
	{
		System.out.println("Hello");
	}

	public void print2()
	{
		System.out.println("Hello World");
	}

	public void show()
	{
		System.out.println("Welcome");
	}

	public static void main(String args[])
	{
		MultiIntrfc m = new MultiIntrfc();
		m.print();
		m.print2();
		m.show();
	}
}