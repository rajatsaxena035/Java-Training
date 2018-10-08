package emailer;

import java.util.*;

class Controller {
	private Model model;
	private View view;

	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}

	public void loginRegister() {
		view.enterChoice();
	}

	public void choiceOperation(int choice) {
		switch (choice) {
		case 1:
			view.registerUser(0);
			// model.accept
			break;
		case 2:
			view.loginUser(0);
			break;
		default:
			view.defaultFunction();
			break;
		}
	}

	public void openMenuSelection(int menu, String username) throws Exception {
		switch (menu) {
		case 1:
			List<List<String>> inbox_mails = model.mInbox(username);
			view.userInbox(inbox_mails);
			view.mainMenu();
			break;
		case 2:
			List<List<String>> sent_mails = model.mSent(username);
			view.userSent(sent_mails);
			view.mainMenu();
			break;
		case 3:
			List<List<String>> draft_mails = model.mDraft(username);
			view.userDraft(draft_mails);
			view.mainMenu();
			break;
		case 4:// Controller obj=new Controller();
			composeMail(0);
			break;
		case 5:
			break;
		default:
			view.defaultFunction();
			break;
		}
	}

	public void composeMail(int step) {
		if (step == 0) {
			view.enterRecipient();
		} else if (step == 1) {
			view.enterSubject();
		} else if (step == 2) {
			view.enterContent();
		} else if (step == 3) {
			view.options();
		}
	}

	public void selectOption(String username, String[] to, String sub, String content, int option) throws Exception {
		switch (option) {
		case 1:
			model.mNew(username, to, sub, content, option - 1);
			view.sentMessage();
			view.mainMenu();
			break;
		case 2:
			model.mNew(username, to, sub, content, option - 1);
			view.saveDraft();
			view.mainMenu();
			break;
		default:
			view.defaultFunction();
			break;
		}
	}

	public boolean existsUsername(String username) throws Exception {// database
		boolean eu = model.mExistsUsername(username);
		return eu;
	}

	/*
	 * public boolean checkUsername(String username) throws Exception {//database
	 * boolean cu = model.mCheckUsername(username); return cu; }
	 */
	public boolean matchUsernamePassword(String username, String password) throws Exception {
		boolean mup = model.mLoginUser(username, password);
		/*
		 * if(mup) { view.loginUser(2); }
		 */
		if (!mup) {
			view.error(4);
			view.loginUser(1);
		}
		return mup;
	}

	public int validateUsername(int choice, String username) throws Exception {

		if (choice == 1) {
			boolean check = existsUsername(username);
			if (check) {
				view.error(1);
				view.registerUser(0);
				return 0;

			} else {
				view.registerUser(1);
				return 1;
			}
		} else if (choice == 2) {
			boolean check = existsUsername(username);
			if (check) {
				view.loginUser(1);
				return 1;
			} else {
				view.error(3);
				view.loginUser(0);
				return 0;
			}
		}

		return 0;
	}

	public void callMenu() {
		view.loginUser(2);
	}

	public void askConfirmPassword() {
		view.registerUser(2);
	}

	public boolean matchPassword(String username, String password, String confirmPassword) throws Exception {
		/*
		 * boolean match=password.equals(confirmPassword); return match; } if(choice==1)
		 * { if(step==1) { view.registerUser(2);
		 * 
		 * return false; } else
		 */
		boolean match = password.equals(confirmPassword);
		if (!match) {
			view.error(2);
			view.registerUser(1);
		} else {
			boolean created = model.mCreateUser(username, password);
			if (created) {
				view.registerUser(3);
			}
		}
		return match;
	}

}
