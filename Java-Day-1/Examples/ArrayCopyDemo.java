class ArrayCopyDemo
{
	public static void main(String args[])
	{
		char[] copyFrom = {'a','b','c','d','e','f','g'};
		char[] copyTo = new char[5];

		System.arraycopy(copyFrom,1,copyTo,0,5);
		System.out.println(new String(copyTo));
	}
}