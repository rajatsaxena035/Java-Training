import java.util.*;
class StreamLimit
{
	public static void main(String[] args) {
	
		Random r  = new Random();
		r.ints().limit(10).sorted().forEach(System.out::println);
	}	
}
