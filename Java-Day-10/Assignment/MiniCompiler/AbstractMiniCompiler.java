import java.util.stream.*;

abstract class AbstractMiniCompiler
{
	// stores the actual code as a string
	String code;
	String statement;

	// abstract method for splitting code
	abstract String[] splitCode(String code);

	// abstract method for converting code to bytecode
	abstract String convertKeyword(String statement);
	
	// abstract method for converting code to bytecode
	abstract String[] convertVariable(String[] statement);
}