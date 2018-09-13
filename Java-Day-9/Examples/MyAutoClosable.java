public class MyAutoClosable implements AutoClosable
{
	public void dolt()
	{
		System.out.println("MyAutoClosable doing it!");
	}

	@Override
	public void close() throws Exception
	{
		System.out.println("MyAutoClosable closed!");
	}
}

public class TryWithResources
{
	public static void main(String args[])
	{
		try(MyAutoClosable myAutoClosable = new MyAutoClosable())
		{
			myAutoClosable.doIt();
		}
		catch(Exception exception)
		{
			System.out.println(exception);
		}
	}
}