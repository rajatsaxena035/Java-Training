class Rectangle
{
	private double width;
	private double height;

	public Rectangle()
	{
		System.out.println("Rectangle Constructor without parameters");
	}

	public Rectangle(double w, double h)
	{
		this.width = w;
		this.height = h;
	}

	public double getWidth()
	{
		return width;
	}

	public void setWidth(double width)
	{
		this.width = width;
	}

	public double getHeight()
	{
		return height;
	}

	public void setHeight(double height)
	{
		this.height = height;
	} 
}