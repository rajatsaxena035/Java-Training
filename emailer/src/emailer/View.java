package emailer;

class View {
	public void enterChoice()
	{
		System.out.println("1: Register \n 2: Login");
	}
	public void registerUser(int step)
	{
		if (step==0)
		{
			System.out.println("Enter username: ");
		}
		if(step==1)
		{
			System.out.println("Enter password: \n Confirm password: ");
		}
		if(step==2)
		{
			System.out.println("Successfully registered!");
		}
	}
	public void error(int n)
	{
		if(n==1)
		{
			System.out.println("Username already exists. \n Enter another username");
		}
		if(n==2)
		{
			System.out.println("Both passwords don't match");
		}
	}

}
