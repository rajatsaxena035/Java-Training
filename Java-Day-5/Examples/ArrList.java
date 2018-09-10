import java.util.*;

class ArrList{
	public static void main(String[] args){
		ArrayList<String> a = new ArrayList<String>();
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("d");
		
		for(String str:a){
			System.out.println(str);
		}
		
		/*a.remove("a");
		
		System.out.println();
		
		for(String str:a){
			System.out.print(str + "\t");
		}*/

		a.forEach(aa -> System.out.println(aa));
		a.stream().forEach(aa -> System.out.println(aa));
	}
}