class A
{
	interface Message
	{
		void msg();
	}
}

class TestNestedInterface2 implements A.Message
{
	public void msg()
	{
		System.out.println("Hello nested interface");
	}

	public static void main(String args[])
	{
		Showable.Message message = new TestNestedInterface1();
		message.msg();
	}
}