import java.util.HashMap;
import java.util.Map;

public class JavaForEachMap
{
	public static void main(String[] args)
	{
		Map<String, Integer> items = new HashMap<>();
		items.put("coins",3);
		items.put("pens",1);
		items.forEach((k,v) -> {
			System.out.printf("%s : %d%n",k,v);
		});
	}
}