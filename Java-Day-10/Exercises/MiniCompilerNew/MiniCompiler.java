import java.io.*;

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

			code_statements[i] = convertInt(code_statements[i]);			

			// ------ int [Stop] ---------



			// ------ float [Start] ---------

			code_statements[i] = convertFloat(code_statements[i]);			

			// ------ float [Stop] ---------



			// ------ object [Start] ---------

			code_statements[i] = convertNew(code_statements[i]);			

			// ------ object [Stop] ---------



			// ------ Function Invocation [Start] ---------

			code_statements[i] = convertCall(code_statements[i]);

			// ------ Function Invocation [Stop] ---------

		}
		return code_statements;
	}

	// Prints the whole code with line numbers for different functions
	String[] printLineNumbers(String[] code_statements)
	{
		int str_length, line_no = 0;
		
		// decorate the output [Start]
		System.out.println("\n====================\n");

		String[] compiled = new String[code_statements.length];

		for(int i = 0; i<code_statements.length; i++)
		{
			str_length = code_statements[i].length(); 
			
			//Checking "start" of a function
			if((! code_statements[i].contains("class") && code_statements[i].charAt(str_length-1) == '{') || line_no > 0)
			{
				if(line_no == 0) System.out.println();
				compiled[i] = "Line " + line_no + ": " + code_statements[i];
				
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
				compiled[i] = code_statements[i] + System.getProperty("line.separator");	
			}
			else
			{
				compiled[i] = code_statements[i];
			}
		}

		// decorate the output [End]
		System.out.println("\n====================\n");

		return compiled;
	}

	void outputClassFile(String[] compiled) throws IOException
	{
		File to_file = new File("example.class");

		FileOutputStream to = null;

		try
		{
			to = new FileOutputStream(to_file,true);
			for(int i=0; i<compiled.length; i++)
			{
				byte[] buffer = compiled[i].getBytes();
				int bytes_read=buffer.length;
				
				to.write(buffer,0,bytes_read);
			}
				
		}
		finally
		{
			if(to != null)
				try
				{
					to.close();

				}
				catch(IOException e) {;}
		}
	}


	// Helper Methods

	String convertInt(String statement)
	{
		if(statement.contains(" int") || statement.contains("(int"))
		{
			statement = statement.replaceAll("int","i_store");
		}

		if( statement.contains("int") )
		{
			if(statement.indexOf("int") == 0)
			{
				statement = statement.replaceAll("int","i_store");
			}
		}

		return statement;
	}

	String convertFloat(String statement)
	{
		if(statement.contains(" float") || statement.contains("(float"))
		{
			statement = statement.replaceAll("float","i_store");
		}

		if( statement.contains("float") )
		{
			if(statement.indexOf("float") == 0)
			{
				statement = statement.replaceAll("float","f_store");
			}
		}
		return statement;
	}

	String convertNew(String statement)
	{
		if(statement.contains(" new ") || statement.contains("=new"))
		{
			statement = "A_store";
		}			

		return statement;
	}

	String convertCall(String statement)
	{
		if(statement.contains("(") && statement.contains(")") && !statement.contains("{"))
		{
			statement = "invoke_special: "+statement;
		}
		return statement;
	}

}