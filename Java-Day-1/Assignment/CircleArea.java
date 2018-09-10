import java.util.Scanner;

class CircleArea
{
	public static void main(String[] args)
	{
		double radius,area;
		Scanner buf = new Scanner(System.in);

		System.out.println("Enter radius: ");
		radius = buf.nextDouble();
		
		area = Math.PI * Math.pow(radius,2);
		System.out.println("Area of Circle: " + area);
	}
}