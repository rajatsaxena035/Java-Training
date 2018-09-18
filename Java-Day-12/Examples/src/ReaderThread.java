import java.util.*;
import java.util.concurrent.*;

public class ReaderThread extends Thread
{
	private ConcurrentHashMap<Integer,String> map;
	String name
	{
		public ReaderThread(ConcurrentHashMap<Integer, String> map, String threadName)
		{
			this.map = map;
			this.name = threadName;
		}
		
		public void run()
		{
			while(true)
			{
				ConcurrentHashMap.KeySetView<Integer, String> keySetView = map.keySet();
				Iterator<Integer> iterator = keySetView.iterator();
				long time = System.currentTimeMillis();
				String output = time + ":" +":";
				while(iterator.hashNext())
				{
					Integer key = iterator.next();
					String value = map.get(key);
				}
			}
		}
	}

}


