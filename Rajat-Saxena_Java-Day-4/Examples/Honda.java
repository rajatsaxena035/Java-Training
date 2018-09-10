class Bike
{
	final void run()
	{
		System.out.println("Running");
	}
}

class Honda extends Bike
{
	void run()
	{
		System.out.println("Ru 100");
	}
	public static void main(String args[])
	{
		Honda h = new Honda();
	}
}