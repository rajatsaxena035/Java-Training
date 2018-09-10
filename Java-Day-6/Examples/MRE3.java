import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class MRE3
{
	public static void main(String[] args) {
		List<String> weeks = new ArrayList<>();
		weeks.add("Monday");
		weeks.add("Friday");
		weeks.add("Sunday");

		System.out.println("----- Using lambda expressions ------");
		weeks.stream().map((s) -> s.toUpperCase()).forEach((s) -> System.out.println(s));

		System.out.println("----- Using method refernece ------");
		weeks.stream().map(String::toUpperCase).forEach(System.out::println);
	}
}