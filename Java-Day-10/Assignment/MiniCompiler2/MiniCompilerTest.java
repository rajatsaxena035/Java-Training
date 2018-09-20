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
		
		
			// take the code string from command-line argument 
			String fileName = args[0];

			// input java file
			compiler.code = compiler.inputJavaFile(fileName).trim();
			

			// split "code string" to "code statements"
			compiler.checkBrackets(compiler.code);
			
			//compiler.checkUndeclared(compiler.code);

			// split "code string" to "code statements"
			code_statements = compiler.splitCode(compiler.code);
			
			// validate public class
			compiler.validatePublic(code_statements, fileName);

			// convert variable names
			code_statements = compiler.convertVariable(code_statements);		
			
			// stream of code statements
			Stream<String> code_stream = Stream.of(code_statements);
			
			// convert keywords and put line numbers
			String[] compiled = code_stream.map(compiler::convertKeyword)
					.map(compiler::iLoad)	
					.map(compiler::putLineNumbers)
					.toArray(String[]::new);
			
			// output class file
			compiler.outputClassFile(compiled,fileName);	
		
	}
}