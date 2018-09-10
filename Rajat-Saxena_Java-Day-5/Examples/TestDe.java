class TestSum<T>{
	public T sum(T x, T y){
		return (x+y);
	}
}

class Main{
	public static void main(String[] args){
		TestSum<Integer> i = new TestSum<Integer>();
		System.out.println(i.sum(10,20));
	}
}