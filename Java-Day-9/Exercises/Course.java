import java.util.*;
import java.util.regex.*;

class Course {
	public static void main(String[] args) {
		
		//System.out.println(args[0]);

		// boolean b = Pattern.matches("^[a-z1-7]$", args[0]);

		/*StringBuilder toc = new StringBuilder(args[0]);
		int toc_len = toc.length();
		toc.deleteCharAt(0);
		toc.deleteCharAt(toc_len - 2);*/

		// System.out.println(b);

		//Map<String,Integer> toc = new HashMap();
		int k = 1;
		for(String i : args)
		{
			if(k%2==0)
			{
				if(i.contains("[1-9]+") == true)
				{

				}
				else
				{
					
				}
			}
			else
			{

			}
			if(i.contains("[1-9]+") == false)			
		}

	}
}