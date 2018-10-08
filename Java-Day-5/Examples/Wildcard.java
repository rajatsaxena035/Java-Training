import java.util.*;

class WildCard{
	public static void main(String[] args){
		List<Integer> list1 = Arrays.asList(1,2,3);
		List<Double> list2 = Arrays.asList(1.25,2.35,3.45);
		printlist(list1);
		printlist(list2);
	}
	private static void printlist(List<?> list){
		System.out.println(list);
	}
}