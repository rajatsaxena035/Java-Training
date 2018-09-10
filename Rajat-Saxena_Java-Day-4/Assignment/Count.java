import java.util.Scanner;

class Count
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String: ");
		String str = sc.nextLine();

		int alphas, spaces, digits, others;
		alphas = spaces = digits = others = 0;

		int str_len = str.length();

		for(int i=0; i<str_len; i++)
		{
			if(str.charAt(i) == ' ') spaces++;
			else if(Character.isLetter(str.charAt(i))) alphas++;
			else if(Character.isDigit(str.charAt(i))) digits++;
			else others++;
		}

		System.out.println("Alphas = "+alphas);
		System.out.println("Digits = "+digits);
		System.out.println("Spaces = "+spaces);		
		System.out.println("Others = "+others);		
	}
}