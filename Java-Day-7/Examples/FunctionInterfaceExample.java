import java.util.function.Function;

public class FunctionInterfaceExample
{
	static String show(String message)
	{
		return "Hello "+message;
	}

	public static void main(String[] args) {
		Function<String,String> fun = FunctionInterfaceExample::show;

		System.out.println(fun.apply("Peter"));
	}
}