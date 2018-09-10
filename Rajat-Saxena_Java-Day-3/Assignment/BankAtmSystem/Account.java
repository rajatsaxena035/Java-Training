class Account
{
	public long accnt_no;
	public double balance;

	public void deposit()
	{
		//deposit
	}

	public void withdraw()
	{
		//withdraw
	}

	void createTransaction()
	{
		//create Transaction
	}
}

class CurrentAccount extends Account
{
	void withdraw()
	{
		//withdraw
	}
}

class SavingAccount extends Account
{
	
}