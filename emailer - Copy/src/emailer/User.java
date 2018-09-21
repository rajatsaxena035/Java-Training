package emailer;
import java.util.*;

class User {
	
	
	
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		
		
		start();
		
		/*objC.usernameCheck()
		if(choice==1)
		{
			boolean check=objC.existsUsername(username);
			if(check)
				{
					objM.setUsername(username);
				}
			else
			{
				objV.error(0);	
				username=sc.next();
			}*/
		
		

	}
	
	public static void start() throws Exception
	{
		Model objM=new Model();
		View objV= new View();
		Controller objC= new Controller(objM, objV);
		Scanner sc = new Scanner(System.in);
		objC.loginRegister();
		int choice=sc.nextInt();
		//objM.setChoice(choice);
		objC.choiceOperation(choice);
		int n=0;
		String username = "";
		while(n!=1)
		{
		username= acceptUsername();
		n=objC.validateUsername(choice, username);
		}
		boolean match=false;
		int step=1;
		while(!match)
		{	
			if(choice==1)
			{
				String password=acceptPassword();
				objC.askConfirmPassword();
				String confirmPassword=acceptPassword();
				match=objC.matchPassword(username, password, confirmPassword);
			}
			else if(choice==2)
			{
				String password=acceptPassword();
				match=objC.matchUsernamePassword(username, password);
			}
		}
		int menu=acceptMenu();
		objC.openMenuSelection(menu, username);
		if(menu==5)
		{
			start();
		}
		if(menu==4)
		{
			String recipient=acceptRecipient();
			String[] recipient_array=recipient.split(",");
			for(int i=0; i<recipient_array.length; i++)
			{
				recipient_array[i]=recipient_array[i].trim();
			}
			objC.composeMail(1);
			String subject=acceptSubject();
			objC.composeMail(2);
			String content="";
			while(sc.hasNextLine())
			{
				if(sc.nextLine().equals("Done"))
					break;
				String[] tokens=sc.nextLine().split("\n");
				
				for (String value : tokens)
				{
                    			content=content+" " +(value);
				}
			}
			objC.composeMail(3);
			//Scanner sc1=new Scanner(System.in);
			int option=acceptOption();
			objC.selectOption(username, recipient_array, subject, content, option);
		}
	}
		public static String acceptUsername()
		{
			Scanner sc = new Scanner(System.in);
			String username=sc.next();
			return username;
		}
		public static String acceptPassword()
		{
			Scanner sc=new Scanner(System.in);
			String password=sc.next();
			return password;
		}
		public static int acceptMenu()
		{
			Scanner sc=new Scanner(System.in);
			int menu=sc.nextInt();
			return menu;
		}
		public static String acceptRecipient()
		{
			Scanner sc=new Scanner(System.in);
			String recipient=sc.next();
			return recipient;
		}
		public static String acceptSubject()
		{
			Scanner sc=new Scanner(System.in);
			String subject=sc.next();
			return subject;
		}
		public static int acceptOption()
		{
			Scanner sc=new Scanner(System.in);
			int option=sc.nextInt();
			return option;
		}

}