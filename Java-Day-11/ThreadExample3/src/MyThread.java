
public class MyThread implements Runnable{
	Account account;
	public MyThread(Account s)
	{
		account = s;
	}
	public void run()
	{
		account.withdraw();
		//account.enquire();
	}
}
