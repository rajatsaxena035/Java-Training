import java.util.ArrayList;
import java.util.List;

public class JavaExamples {

	@SafeVarargs
	private void display(List<String>... products)
	{
		//Not using @SafeVarargs
		for(List<String> product : products)
		{
			System.out.println(product);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaExamples p = new JavaExamples();	
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		p.display(list);
	}
}
