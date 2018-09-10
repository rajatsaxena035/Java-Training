import java.util.Arrays;
import java.util.List;

class unboundedwildcarddemo
{
	public static void main(String[] args)
	{
		List<Integer> t1 = Arrays.asList(1,2,3);
		List<Double> t2 = Arrays.asList(1.1,2.2,3.3);

		printlist(t1);
		printlist(t2);
 	}

 	public static void printlist(List<?> list)
	{
		System.out.println(list);
	}
}