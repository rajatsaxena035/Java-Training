import java.util.*;

final class Algorithm
{
    public static <T extends Object & Comparable<? super T>>
        T max(List<? extends T> list, int begin, int end)
        {

	        T maxElem = list.get(begin);

	        for (++begin; begin < end; ++begin)
	            if (maxElem.compareTo(list.get(begin)) < 0)
	                maxElem = list.get(begin);
	        return maxElem;
    	}
}

class Maximal
{
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		a.add(5);
		a.add(10);
		a.add(15);

		Algorithm algo = new Algorithm();
		System.out.println("Maximal Element= " + algo.max(a,0,3));		
	}
}