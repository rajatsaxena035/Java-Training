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
		objM.setChoice(choice);
		objC.choiceOperation(choice);
		int n=0;
		String username = "";
		while(n!=1)
		{
		username= acceptUsername();
		n=objC.validateUsername(choice, username);
		}
		boolean match=false;
		while(!match)
		{
			String password=acceptPassword();
			String confirmPassword=acceptPassword();
			match=objC.matchPassword(username, password, confirmPassword);
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
