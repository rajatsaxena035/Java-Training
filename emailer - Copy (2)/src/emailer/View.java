package emailer;
import java.util.*;

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
		if(step==2)
		{
			System.out.println("1: Inbox \n2: Sent \n3: Draft \n4: Compose \n5: Logout");
		}
	} 
	public void userInbox(List<List<String>> mails)
	{
		if(mails.size() == 0)
		{
			System.out.println("No mails in Inbox.");
		}
		else
		{
			List<String> index = new ArrayList<String>();
			index.add("From");
			index.add("Subject");
			index.add("Content");
			System.out.println("====================");
			for(List<String> mail : mails)
			{
				for(int i=0; i<mail.size(); i++)
				{
					
					System.out.println(index.get(i)+": "+ mail.get(i) + " ");
				}
				System.out.println("====================");
			}
		}	
	}
	public void sentMessage()
	{
		System.out.println("Your mail has been sent");
	}
	public void saveDraft()
	{
		System.out.println("Saved in Draft");
	}
	public void userSent(List<List<String>> mails)
	{
		if(mails.size() == 0)
		{
			System.out.println("No mails in Sent folder.");
		}
		else
		{
			List<String> index = new ArrayList<String>();
			index.add("To");
			index.add("Subject");
			index.add("Content");
			System.out.println("====================");
			for(List<String> mail : mails)
			{
				for(int i=0; i<mail.size(); i++)
				{
					
					System.out.println(index.get(i)+": "+ mail.get(i) + " ");
				}
				System.out.println("====================");
			}
		}	
	}
	public void userDraft(List<List<String>> mails)
	{
		if(mails.size() == 0)
		{
			System.out.println("No mails in Draft folder.");
		}
		else
		{
			List<String> index = new ArrayList<String>();
			index.add("To");
			index.add("Subject");
			index.add("Content");
			System.out.println("====================");
			for(List<String> mail : mails)
			{
				for(int i=0; i<mail.size(); i++)
				{
					
					System.out.println(index.get(i)+": "+ mail.get(i) + " ");
				}
				System.out.println("====================");
			}
		}	
	}
	
	public void enterRecipient()
	{
		System.out.println("Enter recipient(if you want to enter multiple recipients, separate them with comma): ");
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
		System.out.println("1: Send \n2: Save in draft");
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
	
	public void mainMenu()
	{
		System.out.println("Press 1 for the Main Menu");
	}
}
