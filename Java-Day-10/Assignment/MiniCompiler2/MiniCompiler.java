import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.nio.file.*;


class MiniCompiler extends AbstractMiniCompiler
{
	static int line_no = 0;

	// Check unpaired brackets
	void checkBrackets(String code)
	{
		try
		{
			int curly, square, round, angle;
			curly = square = round = angle = 0;
			for(int i = 0; i < code.length(); i++)
			{
				char c = code.charAt(i);
				if(c == '{') curly++;
				else if(c == '(') round++;
				else if(c == '[') square++;
				else if(c == '<') angle++;
				else if(c == '}')
				{
					curly--;
					if(curly < 0) throw new UnpairedBracketsException("Curly Brackets unmatched");
				}
				else if(c == ')')
				{
					round--;
					if(round < 0) throw new UnpairedBracketsException("Round Brackets unmatched");
				}
				else if(c == ']')
				{
					square--;
					if(square < 0) throw new UnpairedBracketsException("Square Brackets unmatched");
				}
				else if(c == '>')
				{
					angle--;
					if(angle < 0) throw new UnpairedBracketsException("Angle Brackets unmatched");
				}
			}

			if(curly != 0) throw new UnpairedBracketsException("Curly Brackets unmatched");
			if(round != 0) throw new UnpairedBracketsException("Round Brackets unmatched");
			if(square != 0) throw new UnpairedBracketsException("Square Brackets unmatched");
			if(angle != 0) throw new UnpairedBracketsException("Angle Brackets unmatched");	
		}
		catch(UnpairedBracketsException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	void validatePublic(String[] code_statements, String filename)
	{
		filename = filename.split("\\.")[0];
		
		try
		{
			for(String a : code_statements)
			{
				if(a.contains("class") && a.contains("public"))
				{
					String[] as = a.split(" ");
					int j = 0;
					for(j=0; j<as.length; j++)
					{
						if(as[j].equals(filename))
						{
							break;
						}
					}
					if(j==as.length)
					{
						throw new PublicClassException("Public class name not same as file name");
					}
				}
			}
		}
		catch(PublicClassException e)
		{
			System.out.println(e.getMessage());
		}
	}


	// Check undeclared variables and objects
	void checkUndeclared(String code)
	{
		String[] code_spaces = code.split(" ");
		for(int i=0; i<code_spaces.length; i++)
		{
			if(!code_spaces[i].contains("("))
			{
				boolean kwrd = MatchKeywords.match(code_spaces[i]);
				if(!kwrd)
				{
					
				}
			}
		}
	}

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


	// Converts int to i_store, float to f_store, new to A_store, etc
	@Override
	String[] convertVariable(String[] code_statements)
	{
		Map< String,String> hm =  new HashMap< String,String>();
		int ki = 0, kf = 0;
		for(int i=0; i<code_statements.length; i++)
		{
			String[] words = code_statements[i].split(" ");
			for(String word : words)
			{
				//System.out.println(i+"=="+word);
			}
			for(int j=0; j<words.length; j++)
			{
				if(!MatchKeywords.match(words[j]))
				{
					//System.out.println();
					if(j>0 && words[j-1].equals("int") && !words[j].contains("("))
					{
						String inter_i = "i"+Character.forDigit(ki,10);
						hm.put(words[j], inter_i); 
						words[j] = inter_i;
						ki++;
						
						//System.out.println(words[j]);
					}
					
					else if(j>0 && words[j-1].equals("float") && !words[j].equals("("))
					{
						String inter_f = "f"+Character.forDigit(kf,10);
						hm.put(words[j], inter_f);
						words[j] = inter_f;
						kf++;
					}
					
					else
					{
						for (Map.Entry<String, String> entry : hm.entrySet())
						{
							//System.out.println(entry.getKey());
						    if(words[j].equals(entry.getKey()) || words[j].equals(entry.getKey()+";"))
						    {
						    	words[j] = entry.getValue();
						    }
						}
					}
				}
			}
			code_statements[i] = String.join(" ", words);
		}
		return code_statements;
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
	
		return statement;	
	}
	
	String iLoad(String statement)
	{
		if(statement.contains("="))
		{
			String[] arr = statement.split("=");
			arr[1] = "\t    i_load "+arr[0]+" "+arr[1];
			arr[0] = "i_load "+arr[0]+"\n";
			statement = String.join(" ", arr);
		}
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

	String inputJavaFile(String fileName)
	{
		String code = "";
		try
		{
			 code = new String(Files.readAllBytes(Paths.get(fileName)));
			 code = code.replaceAll("\n"," ");
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		return code;
	}

	void outputClassFile(String[] compiled, String fileName)
	{
		String ofn = fileName.split("\\.")[0] + ".class";
		File to_file = new File(ofn);

		FileOutputStream to = null;

		try
		{
			to = new FileOutputStream(to_file);
			for(int i=0; i<compiled.length; i++)
			{
				compiled[i] += System.lineSeparator(); 
				byte[] buffer = compiled[i].getBytes();
				int bytes_read=buffer.length;
				
				to.write(buffer,0,bytes_read);
			}
				
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
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
}