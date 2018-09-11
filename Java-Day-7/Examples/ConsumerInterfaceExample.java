import java.util.function.Consumer;

public class ConsumerInterfaceExample
{
	static void printMessage(String name)
	{
		System.out.println("Hello "+name);
	}

	static void printVal(int val)
	{
		System.out.println(val);
	}

	public static void main(String[] args) {
		Consumer<String> consumer1 = ConsumerInterfaceExample::printMessage;
		consumer1.accept("John");

		Consumer<Integer> consumer2 = ConsumerInterfaceExample::printVal;
		consumer2.accept(12);
	}
	
}