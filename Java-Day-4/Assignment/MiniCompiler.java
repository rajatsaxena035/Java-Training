import java.util.Scanner;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class MiniCompiler
{
	public static void main(String[] args)
	{

		// Stringify code [Start]

		String code = "class Test" +
						"{" +
							"int a;" +
							"float b;" +
							
							"void area(int x)" +
							"{" +
								"System.out.println(\"Age = \" + x);" +
							"}" +
							
							"float perimeter(float y)" +
							"{" +
								"float perimeter = 2*b;" +
								"return perimeter;" +
							"}" +
							
							"public static void main(String[] args)" +
							"{" +
								"String s = \"abc\";" +
								"Test t = new Test();" +
								"t.area(3);" +
							"}"+
						"}";

		// Stringify code [Stop]



		// Split code using ;  {  }   [Start]

		String[] code_statements = code.split(";|\\{|\\}");
		
		// Split code using ;  {  }   [Stop]



		// Parse through each code statement   [Start]

		for(int i=0; i<code_statements.length; i++)
		{


			// ------ int [Start] ---------

			if(code_statements[i].contains(" int") || code_statements[i].contains("(int"))
			{
				code_statements[i] = code_statements[i].replaceAll("int","i_store");
			}

			if( code_statements[i].contains("int") )
			{
				if(code_statements[i].indexOf("int") == 0)
				{
					code_statements[i] = code_statements[i].replaceAll("int","i_store");
				}
			}

			// ------ int [Stop] ---------



			// ------ float [Start] ---------

			if(code_statements[i].contains(" float") || code_statements[i].contains("(float"))
			{
				code_statements[i] = code_statements[i].replaceAll("float","i_store");
			}

			if( code_statements[i].contains("float") )
			{
				if(code_statements[i].indexOf("float") == 0)
				{
					code_statements[i] = code_statements[i].replaceAll("float","i_store");
				}
			}

			// ------ float [Stop] ---------



			// ------ object [Start] ---------

			if(code_statements[i].contains(" new ") || code_statements[i].contains("=new"))
			{
				code_statements[i] = "A_store";
			}			

			// ------ object [Stop] ---------


		}

		// Parse through each code statement   [Stop]



		// ------ Print [Start] ---------

		System.out.println();

		for(int i=0; i<code_statements.length; i++)
		{
			System.out.println(code_statements[i] + ' ');
		}

		System.out.println("-----------");

		code_statements.forEach(aCode -> System.out.println(aCode));

		// ------ Print [Stop] ----------
	}
}