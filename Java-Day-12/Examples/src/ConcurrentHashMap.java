import java.util.*;
import java.util.concurrent.*;

public class ConcurrentHashMap
{
	public static void main(String[] args)
	{
		ConcurrentHashMap<Integer,String> map = new ConcurrenthashMap<>();
		
		new WriterThread(map,"Writer-1",1).start();
		new WriterThread(map,"Writer-2",2).start();
		for(int i = 1; i <= 5; i++)
		{
			new ReaderThread(map,"Reader-"+i);
		}
	}
}
