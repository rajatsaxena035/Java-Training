class VarArgs
{
	static void fun(String str, int ...a)
	{
		System.out.print("String: " + str);
		System.out.println("\nNumber of arguments: " + a.length);
		for(int i:a)
			System.out.print(i+" ");
		System.out.println();
	}

	public static void main(String args[])
	{
		fun("GeekForGeeks",100);
		fun("CSPortal",1,2,3,4);
		fun("forGeeks");
	}
}