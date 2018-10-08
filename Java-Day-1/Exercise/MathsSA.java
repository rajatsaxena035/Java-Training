import java.util.Scanner;
class MathsSA
{
	public static void main(String[] args) 
	{
		Scanner buf = new Scanner(System.in);
		int a,b,sum;
		float avg;
		System.out.print("Enter a = ");
		a=buf.nextInt();
		System.out.print("Enter b = ");
		b=buf.nextInt();
		sum = a+b;
		avg = ((float)a+(float)b)/2;
		System.out.println(sum);
		System.out.println(avg);
	}
}