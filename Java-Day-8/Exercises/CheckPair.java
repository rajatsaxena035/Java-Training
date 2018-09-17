import java.util.stream.*;

class CheckPair
{
	public static void main(String[] args) {
		
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

		Stream<String> code_stream = Stream.of(code);

		long curly_begin = code_stream.filter(s -> s.equals('p')).count();
		
/*		code_stream = Stream.of(code);
		long curly_end = code_stream.filter(s -> s.equals('}')).count();
		
		code_stream = Stream.of(code);
		long round_begin = code_stream.filter(s -> s.equals('(')).count();
		
		code_stream = Stream.of(code);
		long round_end = code_stream.filter(s -> s.equals(')')).count();
		
		code_stream = Stream.of(code);
		long square_begin = code_stream.filter(s -> s.equals('[')).count();
		
		code_stream = Stream.of(code);
		long square_end = code_stream.filter(s -> s.equals(']')).count();
		
		code_stream = Stream.of(code);
		long angle_begin = code_stream.filter(s -> s.equals('<')).count();
		
		code_stream = Stream.of(code);
		long angle_end = code_stream.filter(s -> s.equals('>')).count();*/

		System.out.println(curly_begin);
	}
}
