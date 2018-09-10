import java.util.Vector;

public class BasicvectorOperations
{
	public static void main(String[] args)
	{
		Vector<String> vct = new Vector<String>();
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		System.out.println(vct);
		System.out.println(vct.get(1));
		System.out.println(vct.firstElement());
		System.out.println(vct.lastElement());
		System.out.println(vct.isEmpty());
	}
}