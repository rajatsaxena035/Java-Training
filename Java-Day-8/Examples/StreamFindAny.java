import java.util.*;

class StreamFindAny
{
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a","b","c");
		Optional<String> result = list.stream().filter(item -> item.contains("t")).findAny();
		System.out.println(result.get());
 	}
}