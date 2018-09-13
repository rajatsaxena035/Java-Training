import java.io.*;

class Parent2{
	void msg(){
		System.out.println("parent");
	}
}

class TestExceptionChild2 extends Parent2{
	void msg() throws ArithmeticException {
		System.out.println("child");
	}

	public static void main(String[] args) {
			Parent2 p = new TestExceptionChild2();
			p.msg();
		}	
}