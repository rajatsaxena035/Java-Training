package emailer;

class View {
	public void enterChoice()
	{
		System.out.println("1: Register \n2: Login");
	}
	public void registerUser(int step)
	{
		if (step==0)
		{
			System.out.println("Enter username: ");
		}
		if(step==1)
		{
			System.out.println("Enter password: ");
		}
		if(step==2)
		{
			System.out.println("Confirm password: ");
		}
		if(step==3)
		{
			System.out.println("Successfully registered!");
		}
	}
	public void loginUser(int step)
	{	
		if(step==0)
		{
			System.out.println("Enter username: ");
		}
		if(step==1)
		{
			System.out.println("Enter password: ");
		}
		if(step==3)
		{
			System.out.println("1: Inbox \n2: Sent \n3: Compose");
		}
	} 
	public void userInbox(String username, int id)
	{//display inbox of username with this user id
	}
	public void userSent(String username, int id)
	{//display sent items of username
	}
	public void enterRecipient()
	{
		System.out.println("Enter recipient: ");
	}
	public void enterSubject()
	{
		System.out.println("Enter subject: ");
	}
	public void enterContent()
	{
		System.out.println("Enter the content: ");
	}
	public void options()
	{
		System.out.println("1: Send \n2:Save in draft");
	}
	public void error(int n)
	{
		if(n==1)
		{
			System.out.println("Username already exists. \n Enter another username:");
		}
		if(n==2)
		{
			System.out.println("Both passwords don't match.");
		}
		if(n==3)
		{
			System.out.println("Username does not exist.");
		}
		if(n==4)
		{
			System.out.println("Incorrect password");
		}
	}
	public void defaultFunction()
	{
		System.out.println("Wrong choice!");
	}
}
