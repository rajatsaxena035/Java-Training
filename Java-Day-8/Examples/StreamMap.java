import java.util.*;

class StreamMap
{
	public static void main(String[] args)
	{
		System.out.println("The stream after applying the function is: ");
		List<Integer> list = Arrays.asList(3,6,9,12,15);
		list.stream().map(number -> number*3).forEach(System.out::println);	
	}
}