class Circle
{
	private double radius;

	public Circle()
	{
		System.out.println("Circle Constructor without parameters");
	}

	public Circle(double r)
	{
		this.radius = r;
	}

	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double radius)
	{	
		this.radius = radius;
	}

	public double getDiameter()
	{
		double dia = 2 * Math.PI * radius;
		return  dia;
	}
}