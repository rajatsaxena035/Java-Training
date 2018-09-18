import java.util.Scanner;

class Swapper
{
	float a ;
	float b ;

	Swapper()
	{
		Scanner buf = new Scanner(System.in);

		System.out.println("Enter a: ");
		this.a = buf.nextDouble();
		
		System.out.println("Enter b: ");
		this.b = buf.nextDouble();
	}

	void swap()
	{
		float c ;
		c = b;
		b = a;
		a = c;
	}
}

class SwapFunc
{
	public static void main(String[] args)
	{
		Swapper sw = new Swapper();
		sw.swap();

		System.out.println("After Swapping:");
		System.out.println("a: " + sw.a);
		System.out.println("b: " + sw.b);
	}
}