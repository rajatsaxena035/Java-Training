import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.LongSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class ObjectStats
{
	public static void main(String[] args) {
		System.out.println("-------");

		List<Rectangle> list = Rectangle.getRectangle();
		DoubleSummaryStatistics dstats = list.stream().collect(Collectors.summarizingDouble(Rectangle::getWidth));

		System.out.println(dstats.getMax());
		System.out.println(dstats.getMin());
		System.out.println(dstats.getCount());
		System.out.println(dstats.getSum());
		System.out.println(dstats.getAverage());



		list = Rectangle.getRectangle();
		IntSummaryStatistics dstats = list.stream().collect(Collectors.summarizingInt(Rectangle::getLength));

		System.out.println(dstats.getMax());
		System.out.println(dstats.getMin());
		System.out.println(dstats.getCount());
		System.out.println(dstats.getSum());
		System.out.println(dstats.getAverage());



		list = Rectangle.getRectangle();

		LongSummaryStatistics dstats = list.stream().collect(Collectors.summarizingLong(Rectangle::getId));

		System.out.println(dstats.getMax());
		System.out.println(dstats.getMin());
		System.out.println(dstats.getCount());
		System.out.println(dstats.getSum());
		System.out.println(dstats.getAverage());

	}
}

class Rectangle
{
	private double width;
	private long id;
	private int length;

	public Rectangle(long id, int length, double width)
	{
		this.width = width;
		this.id = id;
		this.length = length;
	}

	public long getId()
	{
		return id;
	}

	public int getLength()
	{
		return length;
	}

	public double getWidth()
	{
		return width;
	}

	public static List<Rectangle> getRectangle()
	{
		List<Rectangle> list = new ArrayList<>();
		list.add(new Rectangle(100l,113,113.44d));
		list.add(new Rectangle(200l,213,213.44d));
		list.add(new Rectangle(300l,313,313.44d));	

	}
}