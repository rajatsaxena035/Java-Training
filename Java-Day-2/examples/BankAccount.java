public class BankAccount
{
	private String ownersName;
	private int accountNumber;
	private float balance;

	public BankAccount(int anAccountNumber, String aName)
	{
		accountNumber = anAccountNumber;
		ownersName = aName;
	}
}

public class OverdraftAccount extends BankAccount
{
	private float overdraftLimit;
	public OverdraftAccount(int anAccountNumber, String aName, float aLimit)
	{
		super(anAccountNumber, aName);
		overdraftLimit = aLimit;
	}
}