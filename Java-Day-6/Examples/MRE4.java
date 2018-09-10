import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class MathOperations
{
	public MathOperations(int a, int b)
	{
		System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
	}
}

public class MRE4
{
	public static void main(String[] args)
	{
		System.out.println("---- Using lambda expressions ----");
		BiConsumer<Integer, Integer> addition1 = (a,b) -> new MathOperations(a,b);
		addition1.accept(10,20);

		System.out.println("---- Using method reference ----");
		BiConsumer<Integer, Integer> addition2 = MathOperations::new;
		addition2.accept(50,20);
	}
}