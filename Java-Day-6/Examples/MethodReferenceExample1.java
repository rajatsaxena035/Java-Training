import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class MathOperation
{
	public int add(int a, int b)
	{
		return a + b;
	}

	public int sub(int a, int b)
	{
		return a + b;
	}
}

public class MethodReferenceExample1
{
	public static void main(String[] args)
	{
		MathOperation op = new MathOperation();

		System.out.println("--------Using lambda expression--------");
		
		BiFunction<Integer,Integer, Integer> add1 =  (a,b) -> op.add(a,b);
		System.out.println("Addition ="+add1.apply(4,5));

		BiFunction<Integer,Integer, Integer> sub1 =  (a,b) -> op.sub(a,b);
		System.out.println("Subtraction ="+sub1.apply(58,5));

		System.out.println("--------Using method reference--------");
		
		BiFunction<Integer,Integer, Integer> add2 =  op::add;
		System.out.println("Addition ="+add2.apply(4,5));

		BiFunction<Integer,Integer, Integer> sub2 =  op::sub;
		System.out.println("Subtraction ="+sub2.apply(58,5));
	}
}