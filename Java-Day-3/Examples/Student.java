class Student
{
	int rollno;
	static String college = "ITS";
	static void change()
	{
		college = "BBDIT";
	}
	Student(int r)
	{
		rollno = r;
	}
	void display()
	{
		System.out.println(rollno+" "+college);
	}
	public static void main(String[] args)
	{
		Student s1 = new Student(111);
		Student s2 = new Student(222);
		s1.display();
		Student.change();
		s1.display();
		s2.display();	
	}
}