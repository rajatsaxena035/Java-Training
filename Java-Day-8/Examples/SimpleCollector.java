import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleCollector
{
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4);
		String mergedString = list.stream().collect(Collectors.joining(","));
		System.out.println(mergedString);
	}
}