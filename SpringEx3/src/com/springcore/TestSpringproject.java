package com.springcore;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestSpringproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		//Resource resource = new ClassPathResource("Beans.xml");
		//BeanFactory factory = new XmlBeanFactory(resource);
		
		//BeanFactory factory = context;
		
		((AbstractApplicationContext)context).registerShutdownHook();
		
		Restaurant obj = (Restaurant)context.getBean("restaurantBean");
		obj.greetCustomers();
	}
}
