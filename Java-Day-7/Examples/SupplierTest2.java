import java.util.Date;
import java.util.function.Supplier;

public class SupplierTest
{
	public static void main(String[] args)
	{
		Supplier<String> helloStrSupplier = () -> new String("Hello");
		String<String> helloStrSupplier.get();
		System.out.println("String in hello is ->"+helloStr+"<-");

		Supplier<String> emptyStrSupplier = String::new;
		String emptyStr = emptyStrSupplier.get();
		System.out.println("String in emptyStr is ->"+emptyStr+"<-");

		Supplier<String> dateSupplier = String::new;
		String emptyStr = emptyStrSupplier.get();
		System.out.println("String in emptyStr is ->"+emptyStr+"<-");

	}
}