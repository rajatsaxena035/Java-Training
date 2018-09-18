import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestThread 
{	
	private final Lock queueLock = new ReentrantLock();
	public void print()
	{
		queueLock.lock();
		try
		{
			Long duration (long)(Math.random()*1000);
		}
		catch(InterruptedException e)
		{
			
		}
		finally
		{
			
		}
	}
}

class ThreadDemo extends Thread
{
	PrintDemo printDemo;
	ThreadDemo(String name, PrintDemo, printDemo)
	{
		super(name);
		this.printDemo = printDemo;
	}
	
	@Override
	public void run()
	{
		System.out.print(Thread.currentThread().getName());
		printDemo.print();
	}
}

public class TestThread
{
	public static void main(String args[])
	{
		PrintDemo PD = new PrintDemo();
		ThreadDemo t1 = new ThreadDemo("Thread - 1",PD);
		ThreadDemo t2 = new ThreadDemo("Thread - 2",PD);
		ThreadDemo t3 = new ThreadDemo("Thread - 3",PD);
		t1.start();
		t2.start();
		t3.start();
	}
}


