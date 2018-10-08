import java.util.Scanner;

class CheckChar
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String line = sc.nextLine();

		char end = line.charAt(line.length() - 1);
		
		System.out.print("Brackets: ");
		if( end == '{' || end == '}' || end == ')' || end == ';')
		{
			System.out.println("Yes ");
		}
		else
		{
			System.out.println("No");
		}
	}
}