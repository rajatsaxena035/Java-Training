import java.util.*;
import java.util.stream.Collectors;

class StreamLower
{
	public static void main(String[] args)
	{
		System.out.println("The stream after applying the function is: ");

		List<String> list = Arrays.asList("JaVA", "World", "j", "A", "v");

		List<String> loc = list.stream().map(String::toLowerCase).collect(Collectors.toList());

		List<Integer> len = list.stream().map(String::length).collect(Collectors.toList());	
		
		System.out.println(loc);
		System.out.println(len);
	}
}