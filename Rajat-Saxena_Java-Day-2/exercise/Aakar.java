abstract class Shape
{
	private String color;
	public abstract double getArea();
	public abstract void toStr();
}

class Rectangle extends Shape
{
	private int length;
	private int width;
	Rectangle(int l, int w)
	{
		this.length = l;
		this.width = w;
	}
	public double getArea()
	{
		return length * width;
	}
	public void toStr()
	{
		System.out.println("length="+length+", width="+width);
	} 
}

class Triangle extends Shape
{
	private int base;
	private int height;	
	Triangle(int b, int h)
	{
		this.base = b;
		this.height = h;
	}
	public double getArea()
	{
		return 0.5 * base * height;
	}
	public void toStr()
	{
		System.out.println("base="+base+", height="+height);
	}
}

class Aakar
{
	public static void main(String[] args)
	{
		Triangle t1 = new Triangle(5,10);
		System.out.println(t1.getArea());

		Rectangle r1 = new Rectangle(5,10);
		System.out.println(r1.getArea());
	}
}