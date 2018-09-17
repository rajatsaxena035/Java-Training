
public class InternetBankingSystem {
	public static void main(String[] args)
	{
		Account accountObject = new Account();
		Thread t1 = new Thread(new MyThread(accountObject));
		Thread t2 = new Thread(new YourThread(accountObject));
		Thread t3 = new Thread(new HerThread(accountObject));
		
		t1.start();
		t2.start();
		t3.start();
		
		int cores = Runtime.getRuntime().availableProcessors();
		System.out.println(cores+" cores");
	}
}
