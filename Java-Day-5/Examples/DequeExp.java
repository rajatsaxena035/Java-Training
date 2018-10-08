import java.util.*;

public class DequeExp{
	public static void main(String[] args){
		Deque<String> de = new ArrayDeque<String>();
		de.offer("arvind");
		de.offer("vinay");
		de.add("mukul");
		de.offerFirst("jai");
		System.out.println("After offer First Traversal....");
		for(String s:de){
			System.out.println(s);
		}
		de.pollLast();
		System.out.println("After polllast() Traversal....");
		for(String s:de){
			System.out.println(s);
		}
	}
}