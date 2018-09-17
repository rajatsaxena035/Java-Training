import java.util.stream.*;

class MiniCompiler extends AbstractMiniCompiler
{
	static int line_no = 0;

	// Splits the whole code string into statements using ; { }
	@Override
	String[] splitCode(String code)
	{
		// Regex: ?<= is the lookaround, it preserves the splitting character
		String[] code_statements = code.split("(?<=;)|(?<=\\{)|(?<=\\})");

		// removing unneeded whitespaces from each statement
		Stream<String> code_stream = Stream.of(code_statements);
		code_statements = code_stream.map(x -> x.trim()).toArray(String[]::new);

		return code_statements;
	}

	// Converts int to i_store, float to f_store, new to A_store, etc
	@Override
	String convertKeyword(String statement)
	{
		this.statement = statement;
		String converted_statement;
		converted_statement = convertInt(this.statement)
								.convertFloat(this.statement)
								.convertNew(this.statement)
								.convertFunctionCall(this.statement)
								.convertFunctionDef(this.statement)
								.toStr(this.statement);

		return converted_statement;
	}

	// Prints the whole code with line numbers in case of different functions
	String putLineNumbers(String statement)
	{
		int str_length = statement.length(); 
		int lno = MiniCompiler.line_no;
		
		//Checking "start" of a function
		if((! statement.contains("class") && statement.charAt(str_length-1) == '{') || lno > 0)
		{	
			//Checking "end" of a function
			if(statement.equals("}"))
			{
				MiniCompiler.line_no = 0;	
			}
			else
			{
				MiniCompiler.line_no++;
			}
			statement = "Line " + lno + ": " + statement;
			//if(lno == 0) x = System.getProperty("line.separator") + x;
		}
		/*else if( x.contains("class") )
		{
			x = x + System.getProperty("line.separator");	
		}*/
	
		return statement;	
	}


	// Helper Methods

	MiniCompiler convertInt(String statement)
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

		this.statement = statement;
		return this;
	}

	MiniCompiler convertFloat(String statement)
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
		this.statement = statement;
		return this;
	}

	MiniCompiler convertNew(String statement)
	{
		if(statement.contains(" new ") || statement.contains("=new"))
		{
			statement = "A_store";
		}			

		this.statement = statement;
		return this;
	}

	MiniCompiler convertFunctionCall(String statement)
	{
		if(statement.contains("(") && statement.contains(")") && !statement.contains("{"))
		{
			statement = "invoke_special: "+statement;
		}

		this.statement = statement;
		return this;
	}
	
	MiniCompiler convertFunctionDef(String statement)
	{
		if(statement.contains("(") && statement.contains(")") && statement.contains("{"))
		{
			statement = "function: "+statement;
		}

		this.statement = statement;
		return this;
	}

	String toStr(String statement)
	{
		return statement;
	}
}