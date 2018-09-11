import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceExample2
{
	static void addList(List<Integer> lst)
	{
		int result = lst.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum of list values:"+result);
	}

	public static void main(String[] args)
	{
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(10);
		lst.add(20);
		lst.add(30);

		Consumer<List<Integer>> consumer = ConsumerInterfaceExample2::addList;
		consumer.accept(lst);
	}
}