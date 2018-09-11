import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest
{
	public static void main(String[] args)
	{
		List<String names = new ArrayList<String>();
		names.add("Harry");
		names.add("Harry2");
		names.stream().
	}
}

private static void printName(Supplier<String> supplier)
{
	System.out.println(supplier.get());
}