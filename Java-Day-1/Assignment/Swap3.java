import java.util.Scanner;

class Swap3
{
	public static void main(String[] args)
	{
		double a,b,c;
		Scanner buf = new Scanner(System.in);

		System.out.println("Enter a: ");
		a = buf.nextDouble();
		
		System.out.println("Enter b: ");
		b = buf.nextDouble();

		c = b;
		b = a;
		a = c;

		System.out.println("After Swapping:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}