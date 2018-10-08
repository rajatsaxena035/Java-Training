class Bike
{
	final int speedlimit=90;
	void run()
	{
		speedlimit=40;
	}

	public static void main(String[] args)
	{
		Bike obj = new Bike();
		obj.run();
	}
}