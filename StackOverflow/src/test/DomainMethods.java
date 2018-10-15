package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class DomainMethods {
	
	/*
		Add domain for a particular user
	*/
	public static boolean addDomain(int user_id, String subject)
	{
		boolean done = false;
		try(Connection con = DbConnection.createConnection())
		{
			PreparedStatement stmt = con.prepareStatement("INSERT INTO so_domains VALUES (?,?)");
	
			stmt.setInt(1, user_id);
			stmt.setString(2, subject);
	
			int i = stmt.executeUpdate();
	
			if (i == 1)
				done = true;
			else
				done = false;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return done;
	}
	
	public static Map<String,Boolean> getDomains(int user_id)
	{
		Map<String, Boolean> m = new HashMap<String,Boolean>();
		
		try(Connection con = DbConnection.createConnection())
		{
			PreparedStatement stmt = con.prepareStatement("SELECT domain FROM so_domains WHERE user_id = ?");
			
			stmt.setInt(1, user_id);

			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{
				System.out.println("hahah");
				m.put(rs.getString("domain"), true);
			}
			
			PreparedStatement stmt2 = con.prepareStatement("SELECT name FROM so_domains_list");

			ResultSet rs2 = stmt2.executeQuery();
			
			while(rs2.next())
			{
				String k = rs2.getString("name");
				if(m.get(k)==null)
					m.put(k, false);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return m;
		
	}

}
