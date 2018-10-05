package org.hibernate;

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
		Query query = session.createQuery("FROM org.hibernate.Employee");
		List<Employee> results = ((org.hibernate.query.Query) query).list();
		for(Employee emp: results)
		{
			System.out.println(emp);
		}
		session.getTransaction().commit();
		session.close();
	}
	
}	
