import java.util.*;

class WildExtends{
	public static void main(String[] args){
		List<Integer> list1 = Arrays.asList(1,2,3);
		System.out.print("Total sum:" + sum(list1));
		
		List<Double> list2 = Arrays.asList(1.25,2.35,3.45);
		System.out.println("\nTotal sum:" + sum(list2));
	}
	private static double sum(List<? extends Number> list){
		double sum=0.0;
		for(Number i:list){
			sum+=i.doubleValue();
		}
		return sum;
	}
}