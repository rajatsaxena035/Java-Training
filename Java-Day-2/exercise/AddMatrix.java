class AddMatrix
{
	public static void main(String[] args)
	{
		int[][] a = {{1,3},{3,4,5}};
		int[][] b = {{1,3,4},{3,4,5}};
		int[][] sum = new int[2][3];

		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==0 && j==2)
				{
					sum[i][j] = 0 + b[i][j];
				}
				else
				{
					sum[i][j] = a[i][j] + b[i][j];	
				}
				System.out.print(sum[i][j] + "  ");
			}
				System.out.println("\n");

		}
	}
}