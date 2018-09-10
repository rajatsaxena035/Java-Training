import java.util.Arrays;
import java.util.Comparator;

class LambdaSort{
	public static void main(String[] args){
		String[] months = {"January","February","March","April","May","June","July","August","September","October","December"};
		System.out.println("Before Sorting:" + Arrays.toString(months));
    //neither this works:
		Arrays.sort(months, 
            (a, b) -> a.length() - b.length()   
		);
    System.out.println("After Sorting:" + Arrays.toString(months));
	}
}