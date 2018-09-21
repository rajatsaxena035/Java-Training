package emailer;
import java.util.*;

class User {
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Model objM=new Model();
		View objV= new View();
		Controller objC= new Controller(objM, objV);
		
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
		int menu=sc.nextInt();
		objC.openMenuSelection(menu);
		if(menu==3)
		{
			String recipient="";
			while(sc.hasNextLine())
			{
				String[] tokens=sc.nextLine().split("\\s");
				for (String value : tokens)
				{
                    			recipient=recipient+" " +(value);
				}
			}//arrays for more than one recipient
			String[] recipient_array=recipient.split("\n");
			objC.composeMail(1);
			String subject=sc.next();
			objC.composeMail(2);
			String content="";
			while(sc.hasNextLine())
			{
				String[] tokens=sc.nextLine().split("\\s");
				for (String value : tokens)
				{
                    			content=content+" " +(value);
				}
			}
			int option=sc.nextInt();
			objC.selectOption(option);
		}
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

}
