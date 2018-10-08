import java.util.Vector;

public class VectorOpt{
	public static void main(String[] a){
		Vector<String> vct = new Vector<String>();
		vct.add("First");
		vct.add("Second");
		System.out.println(vct);
		vct.add(2,"Random");
		System.out.println(vct);
		System.out.println("Element at 3:" + vct.get(3));
		System.out.println("Element at 1st:" + vct.firstElement());
		System.out.println("Element at last:" + vct.lastElement());
		System.out.println("Element is empty?" + vct.isEmpty());
	}
}