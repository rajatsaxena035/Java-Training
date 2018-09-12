import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class SimpleStream2
{
	public static void main(String[] args) {
		Stream<String> words = {"lower","case","text"};

		List<String> list = words.peek(s -> System.out.println(s)).map(s -> s.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(list);
	}
} 