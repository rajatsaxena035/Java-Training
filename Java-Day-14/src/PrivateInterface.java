interface Sayable
{
	default void say()
	{
		saySomething();
		sayPolitely();
	}
	private void saySomething()
	{
		System.out.println("Hello....I'm private method");
	}
	private static void sayPolitely()
	{
		System.out.println("Hello....I'm private static method");
	}
}


public class PrivateInterface implements Sayable
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
			
		Sayable s = new PrivateInterface();
		s.say();
	}
}