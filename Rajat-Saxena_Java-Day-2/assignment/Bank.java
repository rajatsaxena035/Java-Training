abstract class Account
{
	public String name;
	public String accnt_no;
	public String accnt_type;

	private double balance;

	public void open_accnt(String name, String accnt_no, String accnt_type, double balance)
	{
		this.name = name;
		this.accnt_no = accnt_no;
		this.accnt_type = accnt_type;
		this.balance = balance;
	}

	public abstract void deposit(double amount);
	
	public abstract void withdraw(double amount);
	
	public void summary()
	{
		System.out.println("Name="+name+", Balance="+getBalance());
	}

	public double getBalance()
	{
		return balance;
	}

	public void setBalance(double balance)
	{
		this.balance = balance;
	}
}

class CurAcct extends Account
{
	double PENALTY = 0.01;

	public void deposit(double amount)
	{
		double balance = getBalance();
		balance += amount;
		setBalance(balance); 	
	}

	public void withdraw(double amount)
	{
		double balance = getBalance();
		if(balance >= amount)
		{
			balance -= amount;
		}
		else
		{
			balance -= amount + (PENALTY * amount);
		}
		setBalance(balance);
	}
}

class SavAcct extends Account
{
	double INTEREST = 0.05;
	
	public void deposit(double amount)
	{
		double balance = getBalance();
		balance += amount + (INTEREST * amount);
		setBalance(balance);
	}

	public void withdraw(double amount)
	{
		double balance = getBalance();
		if(balance >= amount)
		{
			balance -= amount;
		}
		setBalance(balance);
	}
}

class Bank
{
	public static void main(String args[])
	{
		SavAcct a1 = new SavAcct();
		a1.open_accnt("Brad Pitt", "11002293", "Saving", 1000);

		CurAcct a2 = new CurAcct();
		a2.open_accnt("Angelina Jolie", "11002299", "Current", 20000);

		a1.deposit(3000);
		a2.withdraw(4000);

		a1.summary();
		a2.summary();
	}
}