class Bicycle
{
	int speed = 0;

	void speedUp(int increment)
	{
		speed += increment; 
	}
}

class BicycleDemo
{
	public static void main(String args[])
	{
		Bicycle bike1 = new Bicycle();
		bike1.speedUp(10);
		System.out.println("Speed = " + bike1.speed);
	}
}