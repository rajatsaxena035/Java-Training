import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample
{
	public static void main(String[] args)
	{
		Consumer<Integer> consumer = i -> System.out.print(" "+i);
		List<Integer> integerList = Arrays.asList(new Integer(1), new Integer(10), new Integer(200));
		printList(integerList, consumer);		
	}

	public static void printList(List<Integer> listOfIntegers, Consumer<Integer> consumer)
	{
		for(Integer integer : listOfIntegers)
		{
			consumer.accept(integer);
		}
	}
}