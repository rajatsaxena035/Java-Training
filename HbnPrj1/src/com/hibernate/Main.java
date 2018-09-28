package com.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main
{
	public static void main(String[] args)
	{
		Student_Info student = new Student_Info();
		student.setName("AAA");
		student.setRoll_no(1);
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
