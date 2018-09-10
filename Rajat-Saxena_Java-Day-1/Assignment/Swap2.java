import java.util.Scanner;

class Swap2
{
	public static void main(String[] args)
	{
		double a,b;
		Scanner buf = new Scanner(System.in);

		System.out.println("Enter a: ");
		a = buf.nextDouble();
		
		System.out.println("Enter b: ");
		b = buf.nextDouble();

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After Swapping:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}