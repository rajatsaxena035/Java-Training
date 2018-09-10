class MiniCompiler
{
	public static void main(String[] args)
	{
		String code = args[0];

		String[] code_statements = code.split("(?<=;)|(?<=\\{)|(?<=\\})");

		for(int i = 0; i<code_statements.length; i++)
		{
			code_statements[i] = code_statements[i].trim();
			// System.out.println(code_statements[i]);
		}

		for(int i = 0; i<code_statements.length; i++)
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
					code_statements[i] = code_statements[i].replaceAll("float","f_store");
				}
			}

			// ------ float [Stop] ---------



			// ------ object [Start] ---------

			if(code_statements[i].contains(" new ") || code_statements[i].contains("=new"))
			{
				code_statements[i] = "A_store";
			}			

			// ------ object [Stop] ---------

			//System.out.println(code_statements[i]);
		}

		int str_length, line_no = 0;
		for(int i = 0; i<code_statements.length; i++)
		{
			str_length = code_statements[i].length(); 
			if(code_statements[i].charAt(str_length-1) == '{' || line_no > 0)
			{
				System.out.println("Line " + line_no + ": " + code_statements[i]);
				if(code_statements[i].equals("}"))
				{
					line_no = 0;	
				}
				else
				{
					line_no++;
				}
			}
			else
			{
				System.out.println(code_statements[i]);
			}
		}
	}
}