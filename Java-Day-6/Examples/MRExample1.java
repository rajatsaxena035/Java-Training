import java.util.*;
import java.util.function.*;
import java.util.stream.*;

interface Predicate
{
	boolean test(int n);
}

class EvenOddCheck
{
	public static boolean isEven(int n)
	{
		return n%2 == 0;
	}
}

public class MRExample1
{
	public static void main(String[] args)
	{
		Predicate predicate1 = (n) -> EvenOddCheck.isEven(n);
		System.out.println(predicate1.test(20));

		Predicate predicate2 = EvenOddCheck::isEven;
		System.out.println(predicate2.test(25));
	}
}