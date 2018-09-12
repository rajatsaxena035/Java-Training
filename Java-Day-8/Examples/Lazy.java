import java.util.*;
import java.util.stream.*;
import java.time.*;

public class Lazy
{
	public static void main(String[] args) {
		IntStream stream = IntStream.range(1,5);
		stream = stream.peek(i -> log("starting" , i))
						.filter(i -> { log("filtering", i);
										return i % 2 == 0; })
						.peek(i -> log("post filtering", i));

		log("Invoking terminal method count.");
		log("The count is", stream.count());
	}

	public static void log(Object... objects)
	{
		String s = LocalTime.now().toString();
		for (Object object : objects)
		{
			s += "-" + object.toString();
		}
		System.out.println(s);

		try
		{
			Thread.sleep(1);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}