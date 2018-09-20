class MatchKeywords
{
    static String[] keywords = { "abstract", "assert", "boolean",
            "break", "byte", "case", "catch", "char", "class", "const",
            "continue", "default", "do", "double", "else", "extends", "false",
            "final", "finally", "float", "for", "goto", "if", "implements",
            "import", "instanceof", "int", "interface", "long", "native",
            "new", "null", "package", "private", "protected", "public",
            "return", "short", "static", "strictfp", "super", "switch",
            "synchronized", "this", "throw", "throws", "transient", "true",
            "try", "void", "volatile", "while" };

	public static boolean match(String token)
	{
        boolean res = false;       
        for(String kwd : keywords)
        {
			if(token.equals(kwd))
            {
    	    	res = true;
                break;                    		  	
    	   }
        }
        return res;
    }   
}