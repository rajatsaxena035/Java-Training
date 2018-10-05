package com.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
	public static void main(String[] args)
	{
		Student student = new Student();
		student.setStudent_name("A3");
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(student);
		student = (Student)session.get(Student.class, 1);
		System.out.println(student.getStudent_name());
		student.setStudent_name("A3m");
		//session.delete(student);
		session.getTransaction().commit();
		session.close();
		
	}
}
