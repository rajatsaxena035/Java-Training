class MiniCompiler extends AbstractMiniCompiler
{
	// Splits the whole code string into statements using ; { }
	@Override
	String[] splitCode(String code)
	{
		// Regex: ?<= is the lookaround, it preserves the splitting character
		String[] code_statements = code.split("(?<=;)|(?<=\\{)|(?<=\\})");
		
		// removing unneeded whitespaces from each statement
		for(int i = 0; i<code_statements.length; i++)
		{
			code_statements[i] = code_statements[i].trim();
		}

		return code_statements;
	}

	// Converts int to i_store, float to f_store, new to A_store, etc
	@Override
	String[] convertKeyword(String[] code_statements)
	{
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



			// ------ Function Invocation [Start] ---------

			if(code_statements[i].contains("(") && code_statements[i].contains(")") && !code_statements[i].contains("{"))
			{
				code_statements[i] = "invoke_special: "+code_statements[i];
			}			

			// ------ Function Invocation [Stop] ---------

		}
		return code_statements;
	}

	// Prints the whole code with line numbers for different functions
	void printLineNumbers(String[] code_statements)
	{
		int str_length, line_no = 0;
		
		// decorate the output [Start]
		System.out.println("\n====================\n");

		for(int i = 0; i<code_statements.length; i++)
		{
			str_length = code_statements[i].length(); 
			
			//Checking "start" of a function
			if((! code_statements[i].contains("class") && code_statements[i].charAt(str_length-1) == '{') || line_no > 0)
			{
				if(line_no == 0) System.out.println();
				System.out.println("Line " + line_no + ": " + code_statements[i]);
				
				//Checking "end" of a function
				if(code_statements[i].equals("}"))
				{
					line_no = 0;	
				}
				else
				{
					line_no++;
				}
			}
			else if( code_statements[i].contains("class") )
			{
				System.out.println(code_statements[i] + '\n');	
			}
			else
			{
				System.out.println(code_statements[i]);
			}
		}

		// decorate the output [End]
		System.out.println("\n====================\n");
	}
}