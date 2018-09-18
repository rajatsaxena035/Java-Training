import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TestThread2 {
	private static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock(true);
	private static String message = "a";
	public static void main(String[] args) throws InterruptedException
	{
		Thread t1 = new Thread(new Writer A());
		t1.setName("Writer A");
		
		Thread t2 = new Thread(new Writer B());
		t1.setName("Writer B");
		
		Thread t3 = new Thread(new Reader C());
		t1.setName("Reader");
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
	}
}

static class Writer A implements Runnable
{
	public void run()
	{
		lock.writeLock();
	}
}

static class Writer B implements Runnable
{
	public void run()
	{
		lock.writeLock();
	}
}

