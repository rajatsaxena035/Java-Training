import java.io.*;

class Parent3{
	void msg(){
		System.out.println("parent");
	}
}

class TestExceptionChild3 extends Parent3{
	void msg() throws ArithmeticException {
		System.out.println("child");
	}

	public static void main(String[] args) {
			Parent3 p = new TestExceptionChild3();
			p.msg();
		}	
}