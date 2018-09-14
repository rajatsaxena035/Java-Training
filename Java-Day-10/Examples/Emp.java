import java.io.*;

class Emp implements Serializable
{
	private static final long serialversionUID = 129348938L;
	transient int a;
	static int b;
	String name;
	int age;

	public Emp(String name, int age, int a, int b)
	{
		this.name = name;
		this.age = age;
		this.a = a;
		this.b = b;
	}
}

class SerialExample
{
	public static void printdata(Emp object1) {
		System.out.println("name = "+ object1.name);
		System.out.println("age = "+ object1.age);

		System.out.println("a = "+ object1.a);
		System.out.println("b = "+ object1.b);
	}

	public static void main(String[] args) {
		Emp object = new Emp("ab", 20, 2, 1000);
		String filename = "aaaa.txt";

		try{
		FileOutputStream file = new FileOutputStream(filename);
		ObjectOutputStream out = new ObjectOutputStream(file);
		out.writeObject(object);
		out.close();
		file.close();
		System.out.println("Object has been serialized\n" + "Data before Deserialization.");

		printdata(object);
		object.b = 2000;
	}
	catch(IOException ex)
	{
		System.out.println("IOException is caught");
	}

	object = null;

	try
		{
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			object = (Emp)in.readObject();
			in.close();
			file.close();
			System.out.println("Object has been deserialised \n"+"Data after deserialization.");
			printdata(object);
		}
		catch(IOException ex)
		{
			System.out.println("IOException is caught");
		}
		catch(ClassNotFoundException ex)
		{
			System.out.println("ClassNotFoundException is caught");
		}
}

}