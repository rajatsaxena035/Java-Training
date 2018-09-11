import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceExample3
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

		Consumer<List<Integer>> consumer = (List<Integer> lst2) -> {
			int result = lst2.stream().mapToInt(Integer::intValue).sum();
			System.out.println("Sum of list values:"+result);		
		};
		consumer.accept(lst);
	}
}