package com.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class Main {
	public static void main(String[] args)
	{
		StudentCertification studentCertification1 = new StudentCertification();
		studentCertification1.setCert_name("Core Java");
		
		StudentCertification studentCertification2 = new StudentCertification();
		studentCertification2.setCert_name("Oracle DB");
		
		Student student1 = new Student();
		student1.setStudent_name("A1");
		(student1.getStudentCertification()).add(studentCertification1);
		
		Student student2 = new Student();
		student2.setStudent_name("A2");
		(student2.getStudentCertification()).add(studentCertification2);
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(student1);
		session.save(student2);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
