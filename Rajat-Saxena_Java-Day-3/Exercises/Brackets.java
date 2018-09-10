class Brackets
{
	public static void main(String[] args)
	{
		String code = "class VarArgs"+
						"{"+
							"static void fun(String str, int ...a)"+
							"{"+
								"System.out.print(\"String: \" + str);"+
								"System.out.println(\"\nNumber of arguments: \" + a.length);"+
								"for(int i:a)"+
									"System.out.print(i+\" \");"+
								"System.out.println();"+
							"}"+

							"public static void main(String args[])"+
							"{"+
								"fun(\"GeekForGeeks\",100);"+
								"fun(\"CSPortal\",1,2,3,4);"+
								"fun(\"forGeeks\");"+
							"}"+
						"}";
		
		char[] arr = new char[100];
		int i,k=-1;

		for(i=0; i<code.length(); i++)
		{
			if( code.charAt(i) == '{' || code.charAt(i) == '(' || code.charAt(i) == '[' )
			{
				k++;
				arr[k] = code.charAt(i);
			}
			else if( code.charAt(i) == '}' || code.charAt(i) == ')' || code.charAt(i) == ']' )
			{
				if( arr[k] == '{'  && code.charAt(i) == '}')
					k--;

				else if( arr[k] == '['  && code.charAt(i) == ']')
					k--;
				
				else if( arr[k] == '('  && code.charAt(i) == ')')
					k--;
			}
		}

		if(k==-1)
		{
			System.out.println("All Matching");
		}
		else
		{
			System.out.println("Not Matching");
		}
	}
}