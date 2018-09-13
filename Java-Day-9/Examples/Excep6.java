class Excep6{
	public static void main(String[] args) {
		try{
			try{
				System.out.println("going to divide");
				int b = 39/0;
			} catch(ArithmeticException e){System.out.println(e);}
			try{
				int a[] = new int[5];
				a[5] = 4;
			} catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
			}
			System.out.println();
		}
	}
}