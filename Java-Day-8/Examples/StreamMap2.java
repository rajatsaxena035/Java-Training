import java.util.*;
import java.util.stream.Collectors;

class StreamMap2
{
	public static void main(String[] args)
	{
		System.out.println("The stream after applying the function is: ");

		List<String> list = Arrays.asList("java", "world", "j", "a", "v");

		List<String> answer = list.stream().map(String::toUpperCase).collect(Collectors.toList());	
		
		System.out.println(answer);
	}
}