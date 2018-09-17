/**
	Converting the java code to the compiled bytecode

	@since 2018-09-03
	@version 0.2.3
	@author Rajat Saxena

*/

import java.util.stream.*;

public class MiniCompilerTest
{
	public static void main(String[] args)
	{
		// holds each code statements
		String[] code_statements;

		// get the MiniCompiler instance ( new keyword not used )
		MiniCompiler compiler = MiniCompilerProducer.getMiniCompiler();
		
		try
		{
			// take the code string from command-line argument 
			compiler.code = args[0];

			// split "code string" to "code statements"
			compiler.checkBrackets(compiler.code);
			//compiler.checkUndeclared(compiler.code);

			// split "code string" to "code statements"
			code_statements = compiler.splitCode(compiler.code);

			System.out.println();

			Stream<String> code_stream = Stream.of(code_statements);
			code_stream.map(compiler::convertKeyword)
						.map(compiler::putLineNumbers)
						.forEach(System.out::println);

			System.out.println();	
		}
		catch(UnpairedBracketsException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}