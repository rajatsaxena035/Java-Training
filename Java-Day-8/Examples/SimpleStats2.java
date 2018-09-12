import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.LongSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class SimpleStats2
{
	public static void main(String[] args)
	{
		System.out.println("----Long Summary Statistics----");

		LongSummaryStatistics dstats = LongStream.of(5,10,15)
		.collect(LongSummaryStatistics::new, LongSummaryStatistics::accept, LongSummaryStatistics::combine);	
	
		System.out.println(dstats.getMax());
		System.out.println(dstats.getMin());
		System.out.println(dstats.getCount());
		System.out.println(dstats.getSum());
		System.out.println(dstats.getAverage());
	}
}