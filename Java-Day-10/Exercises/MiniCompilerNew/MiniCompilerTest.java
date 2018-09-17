/**
	Converting the java code to the compiled bytecode

	@since 2018-09-03
	@version 0.3.1
	@author Rajat Saxena

*/

import java.io.*;

public class MiniCompilerTest
{
	public static void main(String[] args) throws IOException
	{
		String[] code_statements;

		// get the MiniCompiler2 instance ( new keyword not used )
		MiniCompiler compiler = MiniCompilerProducer.getMiniCompiler();
		
		// take the code string from command-line argument 
		compiler.code = args[0];

		// split "code string" to "code statements"
		code_statements = compiler.splitCode(compiler.code);
		
		// convert java keyword to compiler keywords
		code_statements = compiler.convertKeyword(code_statements);
		
		// prints code with line numbers
		code_statements = compiler.printLineNumbers(code_statements);

		// output to .class file
		compiler.outputClassFile(code_statements);		
	}
}