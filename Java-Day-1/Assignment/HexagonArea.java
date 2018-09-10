import java.util.Scanner;

class HexagonArea
{
	public static void main(String[] args)
	{
		double length,area;
		Scanner buf = new Scanner(System.in);
		
		System.out.println("Enter side length: ");
		length = buf.nextDouble();
		
		area = (3 * Math.pow(3,0.5) * Math.pow(length,2)) / 2;
		System.out.println("Area of Hexagon: " + area);
	}
}