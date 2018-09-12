import java.util.stream.*;

class CheckPair
{
	String code = "class Test" +
						"{" +
							"int a;" +
							"float b;" +
							
							"void area(int x)" +
							"{" +
								"System.out.println(\"Age = \" + x);" +
							"}" +
							
							"float perimeter(float y)" +
							"{" +
								"float perimeter = 2*b;" +
								"return perimeter;" +
							"}" +
							
							"public static void main(String[] args)" +
							"{" +
								"String s = \"abc\";" +
								"Test t = new Test();" +
								"t.area(3);" +
							"}"+
						"}";

	int curly_begin = code.stream().filter(s -> s.equals('{')).count();
	int curly_end = code.filter(s -> s.equals('}')).count();
	int round_begin = code.filter(s -> s.equals('(')).count();
	int round_end = code.filter(s -> s.equals(')')).count();
	int square_begin = code.filter(s -> s.equals('[')).count();
	int square_end = code.filter(s -> s.equals(']')).count();
	int angle_begin = code.filter(s -> s.equals('<')).count();
	int angle_end = code.filter(s -> s.equals('>')).count();

	// System.out.println(curly_begin);
}
