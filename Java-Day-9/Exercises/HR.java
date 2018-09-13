import java.util.Scanner;
class WrongInputException extends Exception
{
	WrongInputException(String s)
	{
		super(s);
	}
}

class HR
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		try{
			Input n = new Input();
			n.method(age);
		}
		catch(WrongInputException wie)
		{
			System.out.println(wie.getMessage());
		}
	}
}

class Input{
	void method(int age) throws WrongInputException {
		if(age >= 18 && age <= 60)
		{
			System.out.println("Welcome");
		}
		else
		{
			throw new WrongInputException("Wrong Input");
		}
	}
}
