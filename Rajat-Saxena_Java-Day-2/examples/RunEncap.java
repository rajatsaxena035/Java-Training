class EncapTest
{
	private String idNum;
	private int age;
	private String name;

	public String getIdNum()
	{
		return idNum;		
	}

	public void setIdNum(String idNum)
	{
		this.idNum = idNum;		
	}

	public int getAge()
	{
		return age;		
	}

	public void setAge(int age)
	{
		this.age = age;		
	}

	public String getName()
	{
		return name;		
	}

	public void setName(String name)
	{
		this.name = name;		
	}
}

public class RunEncap
{
	public static void main(String[] args)
	{
		EncapTest encap = new EncapTest();
		encap.setName("Rajat");
		encap.setAge(23);
		encap.setIdNum("51454484");

		System.out.println("Name="+encap.getName());
		System.out.println("Age="+encap.getAge());
		System.out.println("IdNum="+encap.getIdNum());
	}
}