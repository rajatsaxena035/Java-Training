abstract class AbstractMiniCompiler
{
	// stores the actual code as a string
	String code;

	// abstract method for splitting code
	abstract String[] splitCode(String code);

	// abstract method for converting code to bytecode
	abstract String[] convertKeyword(String[] code_statements);
}