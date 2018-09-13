public class TestThrow
{
	static void validate(int age)
	{
		if(age < 18)
		{
			throw new ArithmeticException("not valid");
		}
		else
		{
			System.out.println("welcome");
		}
	}

	public static void main(String[] args) {
		validate(13);
		System.out.println("rest");
	}
}