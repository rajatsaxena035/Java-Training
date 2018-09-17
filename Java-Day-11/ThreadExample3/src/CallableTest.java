import java.util.*;
import java.util.concurrent.*;

class Task implements Callable<Long>
{
	@Override
	public Long call()
	{
		long n = 0;
		for(long i = 0; i<100; i++)
		{
			n += i;
		}
		return n;
	}
}

public class CallableTest
{
	public static void main(String args[])
	{
		ExecutorService executor = Executors.newSingleThreadExecutor();
		Callable c = new Task();
		Future<Long> future = executor.submit(c);
		try
		{
			Long result = future.get();
			System.out.println(result);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		executor.shutdown();
	}
}
