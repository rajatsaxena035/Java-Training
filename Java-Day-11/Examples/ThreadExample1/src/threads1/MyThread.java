package threads1;
class MyThread extends Thread
{
	String ss;
	public MyThread(String S)
	{
		ss = S;
	}
	public void run()
	{
		for(int i=0; i<100; i++)
		{
			System.out.println(ss+"=="+i);
		}
	}
}