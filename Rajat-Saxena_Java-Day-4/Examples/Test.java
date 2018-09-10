interface Outer1
{
	void show();

	class Inner1
	{
		public void display()
		{
			System.out.println("Hello 1");
		}
	}
}

class Test extends Outer1.Inner1 implements Outer1
{
	public void show()
	{
		System.out.println("Hello 2");
	}

	public static void main(String args[])
	{
		Test t1 = new Test();
		t1.display();
		t1.show();
	}
}