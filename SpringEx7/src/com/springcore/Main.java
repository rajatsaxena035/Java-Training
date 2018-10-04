package com.springcore;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao dao = (EmployeeDao)ctx.getBean("edao");
		/*Boolean status = dao.saveEmployee(new Employee(101,"Elon Musk",10000000));
		System.out.println(status);*/
		
		/*int status = dao.updateEmployee(new Employee(101,"Bill Gates",10000000));
		System.out.println(status);*/
		
		/*Employee e = new Employee();
		e.setId(101);
		int status = dao.deleteEmployee(e);
		System.out.println(status);*/
		
		List<Employee> list=dao.getAllEmployee();
		for(Employee e:list) System.out.println(e);
			
		
	}

}
