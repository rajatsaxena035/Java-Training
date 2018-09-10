class Prime
{
	public static void main(String args[])
	{
		int cnt = 0, flag;
		for(int i=2; cnt<100; i++)
		{
			flag=0;
			int sqr = (int)Math.sqrt(i) + 1;
			for(int j=2; j<sqr; j++)
			{
				if(i%j == 0)
				{
					flag=1;
					break;	
				} 
			}
			if(flag==0)
			{
				System.out.println(i);
				cnt++;
			}	
		}
	}
}