import java.util.ArrayList;
import java.util.List;

public class ParallelStreamsDemo {
	public static void main(String[] args)
	{
		long t1, t2;
		List<Employee> eList = new ArrayList<Employee>();
		for(int i=0; i<1000; i++)
		{
			eList.add(new Employee("A", 20000));
			eList.add(new Employee("B", 3000));
			eList.add(new Employee("C", 15002));
			eList.add(new Employee("D", 7856));
			eList.add(new Employee("E", 500));
		}
		
		t1 = System.currentTimeMillis();
		System.out.println("Sequencial Stream Count? =" + eList.stream().filter(e -> e.getSalary() > 15000).count());
		
		t2 = System.currentTimeMillis();
		System.out.println("Sequential Stream Time Taken? ="+ (t2-t1)+"\n");
		
		t1 = System.currentTimeMillis();
		System.out.println("Parallel Stream Count? =" + eList.parallelStream().filter(e -> e.getSalary() > 15000).count());
		
		t2 = System.currentTimeMillis();
		System.out.println("Parallel Stream Time Taken? = "+ (t2-t1));
	}
}

class Employee
{
	private int salary;
	private String name;
	public Employee() {}
	public Employee(String name, int salary)
	{
		this.name = name;
		this.salary = salary;
	}
	public int getSalary() { return salary; }
	public void getSalary(int salary) { this.salary = salary; }
	public int getName() { return salary; }
	public void setName(String name) { this.name = name; }
}
