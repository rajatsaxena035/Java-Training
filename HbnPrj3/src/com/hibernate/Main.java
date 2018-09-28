package com.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class Main
{
	public static void main(String[] args)
	{
		Student student = new Student();
		student.setStudent_name("AAA1");
		StudentDetail studentDetail = new StudentDetail();
		studentDetail.setStudent_mobile_number("6787656578");
		studentDetail.setStudent(student);
		student.setStudentDetail(studentDetail);
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
