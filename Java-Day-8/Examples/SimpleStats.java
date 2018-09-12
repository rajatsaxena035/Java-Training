import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.LongSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class SimpleStats
{
	public static void main(String[] args)
	{
		System.out.println("----Double Summary Statistics----");

		DoubleSummaryStatistics dstats = DoubleStream.of(5.12d,10.24d,15.36d)
		.collect(DoubleSummaryStatistics::new, DoubleSummaryStatistics::accept, DoubleSummaryStatistics::combine);	
	
		System.out.println(dstats.getMax());
		System.out.println(dstats.getMin());
		System.out.println(dstats.getCount());
		System.out.println(dstats.getSum());
		System.out.println(dstats.getAverage());



	}
}