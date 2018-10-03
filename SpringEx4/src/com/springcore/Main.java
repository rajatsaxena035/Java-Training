package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Restaurant obj1 = (Restaurant)context.getBean("restaurantBean");
		obj1.setWelcomeNote("Morning");
		obj1.greetCustomer();
		
		Restaurant obj2 = (Restaurant)context.getBean("restaurantBean");
		obj2.greetCustomer();
	}

}
