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
		//case 2: view.loginUser();
				//break;
		//default: view.defaultFunction();
				//break;
		}
	}
	public boolean existsUsername(String username) throws Exception
	{//database
		boolean eu = model.mExistsUsername(username);
		return eu;
	}
	public int validateUsername(int choice, String username) throws Exception
	{    
		boolean check=existsUsername(username);
		if(choice==1)
		{
			if(check)
			{
				view.error(1);
				view.registerUser(0);
				return 0;
				
			}
			else
			{
				view.registerUser(1);
			}
		}
		return 1;
			
		}
	public boolean matchPassword(String username, String password, String confirmPassword) throws Exception
	{
		boolean match=password.equals(confirmPassword);
		if(!match)
		{
			view.error(2);
		}
		else
		{
			boolean created = model.mCreateUser(username, password);
			if(created)
			{
				view.registerUser(2);
			}
		}
		return match;
	}
		

}
