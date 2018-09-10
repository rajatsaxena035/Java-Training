import java.util.Date;

class GeometricObject
{
	private String color;
	private boolean filled;
	private Date dateCreated;

	protected GeometricObject()
	{
		System.out.println("GeometricObject Constructor without parameters");
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public boolean isFilled()
	{
		return filled;
	}

	public Date getDateCreated()
	{
		return dateCreated;
	}

	public String toString()
	{
		System.out.println("Color="+color+", Filled="+filled+", DateCreated="+dateCreated);
	}

	public double getArea()
	{
		double area;
		return area;
	}

	public double getPerimeter()
	{
		double perimeter;
		return perimeter;
	}
}