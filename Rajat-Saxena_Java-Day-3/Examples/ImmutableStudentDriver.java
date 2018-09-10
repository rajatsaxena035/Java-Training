final class ImmutableStudent
{
	private final int id;
	private final String name;
	private final Age age;

	public ImmutableStudent(int id, String name, Age age)
	{
		this.name = name;
		this.id = id;

		Age cloneAge = new Age();
		cloneAge

		this.age = age;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public String getAge()
	{
		Age cloneAge = new Age();
		cloneAge.setDay(this.age.getDay());
		cloneAge.setMonth(this.age.getMonth());
		cloneAge.setYear(this.age.getYear());

		return cloneAge;
	}
}

class ImmutableStudentDriver
{
	public static void main(String args[])
	{
		ImmutableStudent student = new ImmutableStudent(1,"Alex",age);

		System.out.println();

		student.getAge().setYear(1993);
		System.out.println("ID:"+student.getId()+"Name:"+student.getName());
	}
}