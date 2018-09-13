import java.io.*;

class Parent{
	void msg(){
		System.out.println("parent");
	}
}

class TestExceptionChild extends parent{
	void msg() throws IOException {
		System.out.println("child");
	}

	public static void main(String[] args) {
			Parent p = new TestExceptionChild();
			p.msg();
		}	
}