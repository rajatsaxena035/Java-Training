import java.util.*;

class ArrList{
	public static void main(String[] args){
		ArrayList<String> a = new ArrayList<String>();
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("d");
		
		for(String str:a){
			System.out.print(str + "\t");
		}
		
		a.remove("a");
		
		System.out.println();
		
		for(String str:a){
			System.out.print(str + "\t");
		}
	}
}