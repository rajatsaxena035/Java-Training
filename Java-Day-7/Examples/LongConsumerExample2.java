import java.util.function.LongConsumer;

public class LongConsumerExample2
{
	public static void main(String[] args) {
		LongConsumer consumer1 = (a) -> {
			long b = a * a;
			System.out.println(b);
		};	

		LongConsumer consumer2 = (a) -> {
			long c = a * a * a;
			System.out.println(c);
		};

		consumer1.andThen(consumer2).accept(10);
		consumer2.andThen(consumer1).accept(15);
	}
}