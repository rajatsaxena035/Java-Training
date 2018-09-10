import java.util.Scanner;

class RectanglePeri
{
	public static void main(String[] args)
	{
		double length,breadth,perimeter;
		Scanner buf = new Scanner(System.in);

		System.out.println("Enter length: ");
		length = buf.nextDouble();
		
		System.out.println("Enter breadth: ");
		breadth = buf.nextDouble();

		perimeter = 2 * (length + breadth);
		System.out.println("Perimeter of Rectangle: " + perimeter);
	}
}