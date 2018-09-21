package emailer;

class Controller {
	private Model model;
	private View view;
	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}
	public void loginRegister()
	{
		view.enterChoice();
	}
	public void choiceOperation(int choice)
	{
		switch(choice)
		{
			case 1: view.registerUser(0);
					//model.accept
				break;
			case 2: view.loginUser();
				break;
			default:view.defaultFunction();
				break;
		}
	}
	public void openMenuSelection(int menu)
	{
		switch(menu)
		{
			case 1: view.userInbox();
				break;
			case 2: view.userSent();
				break;
			case 3: ComposeMail(0);
				break;
			default:view.defaultFunction();
				break;
		}
	}
	public static void composeMail(int step)
	{
		if(step==0)
		{
			view.enterRecipient();
		}
		if(step==1)
		{
			view.enterSubject();
		}
		if(step==3)
		{
			view.enterContent();
		}
		if(step==4)
		{
			view.options();
		}
	}
	public void selectOption(int option)
	{
		switch(option)
		{
			case 1: model.mNew(0);
				break;
			case 2: model.mNew(1);
				break;
			default:view.defaultFunction();
				break;
		}
	}
	public boolean existsUsername(String username) throws Exception
	{//database
		boolean eu = model.mExistsUsername(username);
		return eu;
	}
	public boolean checkUsername(String username) throws Exception
	{//database
		boolean cu = model.mCheckUsername(username);
		return cu;
	}
	public boolean matchUsernamePassword(String username, String password) throws Exception
	{
		boolean mup = model.mLoginUser(username, password);
		if(mup)
		{
			view.loginUser(2);
		}
		else
		{
			view.error(4);
			view.loginUser(1);
		}
		return mup;
	}
	public int validateUsername(int choice, String username) throws Exception
	{    
		
		if(choice==1)
		{
			boolean check=existsUsername(username);
			if(check)
			{
				view.error(1);
				view.registerUser(0);
				return 0;
				
			}
			else
			{
				view.registerUser(1);
				return 1;
			}
		}
		else if(choice==2)
			{
				boolean check=checkUsername(username);
				if(check)
				{
					view.loginUser(1);
					return 1;
				}
				else
				{
					view.error(3);
					view.loginUser(0);
					return 0;
				}
			}
		
			
		}
	}
	public boolean matchPassword(String username, String password, String confirmPassword) throws Exception
	{
		boolean match=password.equals(confirmPassword);
		return match;
	}
		if(choice==1)
			{
				if(step==1)
					{
					view.registerUser(2);
						
					return false;
					}
				else
		boolean match=password.equals(confirmPassword);
		if(!match)
		{
			view.error(2);
			view.registerUser(1);
		}
		else
		{
			boolean created = model.mCreateUser(username, password);
			if(created)
			{
				view.registerUser(3);
			}
		}
		return match;
	}
		

}
