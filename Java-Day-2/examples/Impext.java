interface A
{
	void a();
	void c();
	void d();
}

abstract class B implements A
{
	public void c()
	{
		System.out.println("C");
	}
}

class M extends B
{
	public void a()
	{
		System.out.println("A");
	}

	public void d()
	{
		System.out.println("D");
	}	
}

class Impext
{
	public static void main(String[] args)
	{
		A a = new M();
		a.a();
		a.c();
		a.d();	
	}
}