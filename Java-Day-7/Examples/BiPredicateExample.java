import java.util.function.BiPredicate;

class BiPredicateExample
{
	public static void main(String[] args)
	{
		BiPredicate<String, String> predicate = (s1,s2) -> (s1.equals(s2));

		System.out.println(predicate.test("Java", "Java"));

		System.out.println(predicate.test("JAVA", "Hello"));	
	}
}