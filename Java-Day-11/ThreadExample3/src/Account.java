
public class Account {
	int balance;
	
	public void deposit()
	{
		balance += 10; 
	}
	
	public synchronized void withdraw()
	{
		balance -= 5;
		System.out.println(balance);
	}
	
	public synchronized void enquire()
	{
		System.out.println(balance); 
	}
}
