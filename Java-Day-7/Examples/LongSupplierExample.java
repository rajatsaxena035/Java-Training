import java.util.function.LongSupplier;

public class LongSupplierExample
{
	public static void main(String[] args)
	{
		LongSupplier supplier = () -> 10l;
		System.out.println(supplier.getAsLong());

		double value = 451.456;
		LongSupplier supplier2 = () -> new Double(value).longValue();

		System.out.println(supplier2.getAsLong());
	}
}