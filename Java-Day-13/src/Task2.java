
public class Task2 {
	public static void main(String[] args)
	{
		Optional<Employee> maxSalaryEmp = employeeList.stream()
				.reduce((Employee a, Employee b) -> a.getSalary() < b.getSalary() ? b : a);
		
		if(maxSalaryEmp.isPresent())
		{
			
		}
	}
}
