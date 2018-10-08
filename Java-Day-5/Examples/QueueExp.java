import java.util.*;

public class QueueExp{
	public static void main(String[] args){
		Queue<String> q = new LinkedList<String>();
		q.add("b");
		q.add("a");
		q.add("c");
		q.add("e");
		q.add("d");
		
		Iterator it = q.iterator();
		System.out.println("Initial size of queue:" + q.size());
		while(it.hasNext()){
			String iteratorValue = (String)it.next();
			System.out.println("Queue Next Value:" + iteratorValue);
		}
		System.out.println("Queue peek:" + q.peek());
		System.out.println("Queue poll:" + q.poll());
		System.out.println("Final Size of Queue:" + q.size());
	}
}