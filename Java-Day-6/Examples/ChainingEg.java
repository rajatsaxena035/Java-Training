public class ChainingEg
{
	public static void main(String[] args)
	{
		String name = "Java Developers";

		StringBuffer sb = new StringBuffer();
		sb.append("Hello ");
		sb.append(name);
		sb.append("! Welcome!");
		System.out.println("Without chaining: \n" + sb);
		StringBuffer sb1 = new StringBuffer();
		sb1.append("Hello ").append(name).append("! Welcome!");
		System.out.println("With chaining:\n"+sb1);
	}
}