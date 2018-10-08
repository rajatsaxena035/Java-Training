class MatchKeywords
{
	public static void main(String[] args)
	{
		String[] keywords = { "abstract", "assert", "boolean",
                "break", "byte", "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else", "extends", "false",
                "final", "finally", "float", "for", "goto", "if", "implements",
                "import", "instanceof", "int", "interface", "long", "native",
                "new", "null", "package", "private", "protected", "public",
                "return", "short", "static", "strictfp", "super", "switch",
                "synchronized", "this", "throw", "throws", "transient", "true",
                "try", "void", "volatile", "while" };

                
                int cnt = 0;

                System.out.println("\nAll Matching Keywords: ");
                System.out.println("----------------");	
                
                for(String word : args)
                {
                	for(String kwd : keywords)
                	{
                		if(word.equals(kwd))
                		{
                			cnt += 1;
                			System.out.println(cnt+". "+kwd);
                		}
                	}
                }

                System.out.println("----------------");	
                System.out.println("Total Matched Keywords: "+cnt);	
        }
}