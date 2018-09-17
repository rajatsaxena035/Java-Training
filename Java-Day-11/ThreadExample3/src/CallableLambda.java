import java.util.*;
import java.util.concurrent.*;

public class CallableLambda
{
	public static void main(String args[])
	{
		ExecutorService executor = Executors.newSingleThreadExecutor();
		Callable c = () ->
		{
			
				long n = 0;
				for(long i = 0; i<100; i++)
				{
					n += i;
				}
				return n;
			
		};
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
