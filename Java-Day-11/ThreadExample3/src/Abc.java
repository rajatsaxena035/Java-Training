import java.util.concurrent.atomic.AtomicInteger;

class AtomicIntegerExample{
	private static AtomicInteger at = new AtomicInteger(0);
	static class MyRunnable implements Runnable
	{
		
		private int myCounter;
		private int myPrevCounter;
		private int myCounterPlus5;
		private boolean isNine;
		
		public void run()
		{
			myCounter = at.incrementAndGet();
			System.out.println("Thread " + Thread.currentThread().getId()+" / Counter: "+myCounter);
			
			myPrevCounter = at.getAndIncrement();
			
			System.out.println("");
		}
	}
}

public class Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


