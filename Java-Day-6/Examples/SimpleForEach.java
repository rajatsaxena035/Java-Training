import java.util.*;
import java.util.function.*;

public class SimpleForEach
{
	public static void main(String[] args)
	{
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);
	}
}