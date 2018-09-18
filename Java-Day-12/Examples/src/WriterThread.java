import java.util.concurrent.ConcurrentMap;

public class WriterThread extends Thread{
	private ConcurrentMap<Integer, String> map;
	private Random random;
	private String name;
	
	public WriterThread(ConcurrentMap<Integer>, <String> map, String threadName, long randomSeed)
	{
		this.map = map;
		this.random = new Random(randomSeed);
		this.name = threadName;
	}
	
	public void run()
	{
		while(true)
		{
			Integer key = random.nextInt(10);
			String value = name;
			if(map.putIfAbsent(key, value) == null)
			{
				long time = System.currentTimeMills();
				String output = String.format("%d: %s has put [%d => %s] ", time, name, key, value);
				System.out.println(output);
			}
			
			Integer keyToRemove = random.nextInt(10);
			if(map.remove(keyToRemove, value))
			{
				try
				{
					
				}
				catch()
				{
					
				}
			}
		}
	}
}
