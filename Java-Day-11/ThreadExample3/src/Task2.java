 import java.util.Timer;
 import java.util.TimerTask;

public class Task2 {
	public static void main(String[] args)
	{
		TimerTask task = new TimerTask()
		{
			public void run()
			{
				System.out.println("Hello...");		
			}
		};
		
		Timer timer = new Timer();
		long delay = 0;
		long intervalPeriod = 1000;
		timer.scheduleAtFixedRate(task,delay,intervalPeriod);
	}
}
