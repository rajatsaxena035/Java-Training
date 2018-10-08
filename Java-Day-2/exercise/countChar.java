class countChar
{
	public static void main(String args[])
	{
		int i;
		int a = 0, z = 0;
		String str = "class Triangle1" +
					 "{" + 
						"public static void main(String[] args)" + 
						"{" + 
							"int i=0,j=0;" + 
							"for(i=0; i<=3; i++)" +
							"{" +
							 	"for(j=0; j<=i; j++)" + 
							 	"{" + 
							 		"System.out.print(i + ' ');" + 
							 	"}" + 
							 	"System.out.println();" + 
							 "}" + 
						"}" + 
					"}";

		for(i=0; i<str.length(); i++)
		{
			if(str.charAt(i) == '{')
			{
				a++;
			}
			else if(str.charAt(i) == '}')
			{
				z++;
			}
		}
		System.out.println("No. of { = " + a);
		System.out.println("No. of } = " + z);
	}
}