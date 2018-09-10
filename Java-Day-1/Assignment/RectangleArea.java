import java.util.Scanner;

class RectangleArea
{
	public static void main(String[] args)
	{
		double length,breadth,area;
		Scanner buf = new Scanner(System.in);

		System.out.println("Enter length: ");
		length = buf.nextDouble();
		
		System.out.println("Enter breadth: ");
		breadth = buf.nextDouble();

		area = length * breadth;
		System.out.println("Area of Rectangle: " + area);
	}
}