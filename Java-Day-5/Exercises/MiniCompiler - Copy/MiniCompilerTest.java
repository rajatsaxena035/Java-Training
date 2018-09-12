/**
	Converting the java code to the compiled bytecode

	@since 2018-09-03
	@version 0.2.3
	@author Rajat Saxena
	 
*/


class MiniCompilerTest
{
	public static void main(String[] args)
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
		compiler.printLineNumbers(code_statements);
	}
}