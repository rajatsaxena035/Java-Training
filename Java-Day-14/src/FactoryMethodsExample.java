import java.util.List;

public class FactoryMethodsExample
{
	public static void main(String[] args)
	{ 
		List<String> list = List.of("Java", "JavaFX", "Spring");
		
		for(String l : list)
		{
			System.out.println(l);
		}
	}
}
