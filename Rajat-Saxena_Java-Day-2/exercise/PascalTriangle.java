class PascalTriangle
{
	public static void main(String[] args)
	{
		int i = 0;
		int a = 1, b = 0;
		for(i=0; i<5; i++)
		{
			for(j=0; j<=i; j++)
			{
				System.out.println(a+b);
			}
		}
	}
}