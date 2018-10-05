package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main
{
	public static void main(String[] args)
	{
		StudentAddress studentAddress = new StudentAddress();
		studentAddress.setAddress("Delhi");
		
		Student s1 = new Student();
		s1.setStudent_name("AAA1");
		s1.setStudentAddress(studentAddress);
		
		Student s2 = new Student();
		s2.setStudent_name("AAA2");
		s2.setStudentAddress(studentAddress);
		
		(studentAddress.getStudents()).add(s1);
		(studentAddress.getStudents()).add(s2);
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(studentAddress);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
