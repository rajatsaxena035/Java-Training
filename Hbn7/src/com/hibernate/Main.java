package com.hibernate;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main
{
	public static void main(String[] args)
	{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("FROM com.hibernate.Employee");
		List<Employee> results = ((org.hibernate.query.Query) query).list();
		int flag=1;
		int id;
		for(Employee emp: results)
		{
			flag=1;
			id = emp.getEmployee_id();
			for(int i=2;i<id;i++)
			{      
			    if(id%i==0)
			    {            
			     flag=0;      
			     break;      
			    }     
			}
			if(flag==1)
			{
				System.out.println(emp.getName()+" - "+id);
			}
		}
		session.getTransaction().commit();
		session.close();
	}
	
}	
