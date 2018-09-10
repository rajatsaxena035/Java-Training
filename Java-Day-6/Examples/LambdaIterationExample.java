import java.util.*;
import java.util.function.*;

public class LambdaIterationExample
{
	public static void main(String[] args)
	{
		List<String> fruits = Arrays.asList("apple","banana","lemon","orange");
		System.out.println("==== Classic enhanced for loop ====");
		for(String aFruit : fruits)
		{
			System.out.println(aFruit);
		}

		System.out.println("\n ==== Lambda Expressions ====");
		fruits.forEach(s -> System.out.println(s));

		System.out.println("\n ==== Lambda Method Reference ====");
		fruits.forEach(System.out::println);		
		
		System.out.println("\n ==== Lambda Method Reference ====");
		fruits.forEach(Fruit::countWord);
	}
}

class Fruit
{
	static void countWord(String s)
	{
		System.out.println(s.length());
	}
}