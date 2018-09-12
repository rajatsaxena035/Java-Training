import java.util.*;

public class SimpleStream3
{
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java","is","not","great");
		list.stream().filter(s -> !s.startsWith("n")).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
	}
}