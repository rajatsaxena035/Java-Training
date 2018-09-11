import java.util.function.LongConsumer;

public class LongConsumerExample
{
	public static void main(String[] args) {
		LongConsumer consumer = (a) -> {
			long b = a * a;
			System.out.println(b);
		};

		consumer.accept(100);
		consumer.accept(10000);
	}
}