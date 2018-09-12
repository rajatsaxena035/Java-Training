import java.util.*;
import java.util.function.*;

public class Calculator
{
	static double add(double a)
	{
		double c = a*2;
		return c;
	}

	public static void main(String[] args)
	{
		double a = 2.1;
		double b = 5.7;

		Function<Double,Double> f = Calculator::add;
		System.out.println(f.apply(a));
	}
}