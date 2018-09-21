package emailer;

import java.util.*;

/***
 *
 * <h1><b>Emiley</h1></b> The User class <i><b>INTERACTS</i></b> with the user
 * And return the ample output according to the input It is a
 * <i><b>MaILING</i></b> system that allows user to Compose Mail, Access Inbox,
 * Access All Sent Mails, Create and Save Drafts
 *
 *
 * @version 1.0.0
 * @since 20/9/18
 *
 ***/

public class User {

	/***
	 *
	 * This is the main method that makes user use all choices
	 *
	 ***/

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		start();

		/*
		 * objC.usernameCheck() if(choice==1) { boolean
		 * check=objC.existsUsername(username); if(check) { objM.setUsername(username);
		 * } else { objV.error(0); username=sc.next(); }
		 */

	}

	public static void start() throws Exception {
		Model objM = new Model();
		View objV = new View();
		Controller objC = new Controller(objM, objV);
		Scanner sc = new Scanner(System.in);
		objC.loginRegister();
		int choice = sc.nextInt();
		// objM.setChoice(choice);
		objC.choiceOperation(choice);
		int n = 0;
		String username = "";
		while (n != 1) {
			username = acceptUsername();
			n = objC.validateUsername(choice, username);
		}
		boolean match = false;
		int step = 1;
		while (!match) {
			if (choice == 1) {
				String password = acceptPassword();
				objC.askConfirmPassword();
				String confirmPassword = acceptPassword();
				match = objC.matchPassword(username, password, confirmPassword);
			} else if (choice == 2) {
				String password = acceptPassword();
				match = objC.matchUsernamePassword(username, password);
			}
		}
		menuAll(objC, objV, objM, sc, username);

	}

	public static void menuAll(Controller objC, View objV, Model objM, Scanner sc, String username) throws Exception {
		objC.callMenu();
		int menu = acceptMenu();
		objC.openMenuSelection(menu, username);
		/*
		 * if(menu==5) { start(); }
		 */
		if (menu == 4) {
			String recipient = acceptRecipient();
			String[] recipient_array = recipient.split(",");
			for (int i = 0; i < recipient_array.length; i++) {
				recipient_array[i] = recipient_array[i].trim();
			}
			objC.composeMail(1);
			String subject = acceptSubject();
			objC.composeMail(2);
			String content = "";
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				if (line.equals("Done"))
					break;
				String[] tokens = line.split("\n");

				for (String value : tokens) {
					content = content + "\n" + (value);
				}
			}
			objC.composeMail(3);
			// Scanner sc1=new Scanner(System.in);
			int option = acceptOption();
			objC.selectOption(username, recipient_array, subject, content, option);

		}
		if (menu == 5) {
			start();
		}
		int changeMenu = sc.nextInt();
		if (changeMenu == 1) {
			menuAll(objC, objV, objM, sc, username);
		}
	}

	/***
	 *
	 * This method is used to accept Username entered by the user
	 * 
	 * @param username This is the parameter entered by the user for registration
	 *                 and login
	 *
	 ***/

	public static String acceptUsername() {
		Scanner sc = new Scanner(System.in);
		String username = sc.next();
		return username;
	}

	/***
	 *
	 * This method is used to accept Password entered by the user
	 * 
	 * @param password This is the parameter entered by the user as password
	 *
	 ***/
	public static String acceptPassword() {
		Scanner sc = new Scanner(System.in);
		String password = sc.next();
		return password;
	}

	public static int acceptMenu() {
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		return menu;
	}

	public static String acceptRecipient() {
		Scanner sc = new Scanner(System.in);
		String recipient = sc.next();
		return recipient;
	}

	public static String acceptSubject() {
		Scanner sc = new Scanner(System.in);
		String subject = sc.next();
		return subject;
	}

	public static int acceptOption() {
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		return option;
	}

}
