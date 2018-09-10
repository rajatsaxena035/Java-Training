class Test<T extends Number>{
	T obj1;
	T obj2;
	Test(T obj1,T obj2){
		this.obj1=obj1;
		this.obj2=obj2;
	}

	public void getObject(){
		if(this.obj1 instanceof Integer){
			System.out.println(this.obj1.intValue()+this.obj2.intValue());
		}
		else if(this.obj1 instanceof Long){
			System.out.println(this.obj1.longValue()+this.obj2.longValue());
		}
		else if(this.obj1 instanceof Double){
			System.out.println(this.obj1.doubleValue()+this.obj2.doubleValue());
		}
		else if(this.obj1 instanceof Float){
			System.out.println(this.obj1.floatValue()+this.obj2.floatValue());
		}
	}
}

class Sum{
	public static void main(String[] args){
		Test <Float> obj=new Test<Float>(2.02f,3.035f);
		obj.getObject();
	}
}