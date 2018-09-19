import java.util.Arrays;
import java.util.List;

class Employee
{
	private String name;
	private Integer age;
	private Double salary;
	
	Employee(name, age, salary)
	{
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
}

public class ReducingWithStreams
{
	static List<Employee> employeeList = Arrays.asList(
			new Employee("Tom Jones", 45, 7000.00),
			new Employee("Harry Major", 25, 7000.00),
			new Employee("Ethan Hardy", 65, 7000.00),
			new Employee("Nancy Sprightly", 22, 7000.00)
			));
			
	public static void main(String[] args)
	{
		Double totalSalaryExpense = employeeList.stream()
									.map(emp -> emp.getSalary())
									.reduce(0.00, (a,b) -> a>b);
		System.out.println("Total salary expense:" + totalSalaryExpense);
	}
}