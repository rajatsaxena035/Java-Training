class TestSum<T>
{
	public T sum(T x, T y)
	{
		if(T instanceof Integer)
		{
			Integer z = Integer.sum(x,y);
			return (T)z;	
		}
		return null;
		
	}
}

class Main2
{
	public static void main(String args[])
	{
		TestSum<Integer> i = new TestSum<Integer>();
		System.out.println(i.sum((Integer)10,(Integer)5));
	}
}