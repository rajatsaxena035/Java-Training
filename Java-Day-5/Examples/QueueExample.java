import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample
{
	public static void main(String[] args)
	{
		Queue<String> qe = new LinkedList<String>();
		qe.add("b");
		qe.add("a");
		qe.add("c");

		Iterator it = qe.iterator();
		System.out.println(qe.size());

		while(it.hasNext())
		{
			String iteratorValue=(String)it.next();
		}
	}
}