package net.roseindia;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ManageWorker {

	public static void main(String[] args)
	{
		try
		{
		
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();
			
			//For passing Date of birth as String
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date dob=null;
			try {
			dob = sdf.parse("1987-05-21");
			} catch (ParseException e) {
			e.printStackTrace();
			}
			
			Worker worker = new Worker();
			worker.setFirstname("Alexander");
			worker.setLastname("Houstan");
			worker.setBirthDate(dob);
			worker.setCellphone("919595959595");
			session.save(worker);
			
			session.getTransaction().commit();
			session.close();
		
		}
		catch(Throwable ex)
		{
			System.err.println("Failed"+ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
}