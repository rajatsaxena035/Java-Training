import java.util.*;

public class ReducingWithStreams2 {
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(1,2,3,4);
		int sum = list.parallelStream().reduce(1, (x,y) -> x+y);
		System.out.println("Sum="+sum);
	}
}
