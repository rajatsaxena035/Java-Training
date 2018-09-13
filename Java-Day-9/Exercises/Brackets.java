import java.util.Scanner;
class WrongInputException extends Exception
{
	WrongInputException(String s)
	{
		super(s);
	}
}

class Brackets
{
	public static void main(String[] args) {
		

		try{
			Input n = new Input();
			n.method(arg[0]);
		}
		catch(WrongInputException wie)
		{
			System.out.println(wie.getMessage());
		}
	}
}

class Input{
	void method(String code) throws WrongInputException {
		code.stream().filter(s -> s.contains('{').count();
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
