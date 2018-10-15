package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserMethods
{
	
	
	
	/*
		Login
	*/
	public static boolean login(String email, String pass)
	{
		boolean find = false;
		try(Connection con = DbConnection.createConnection())
		{
			PreparedStatement stmt = con.prepareStatement("SELECT * FROM so_users WHERE email = ? AND pass = ?");

			stmt.setString(1, email);
			stmt.setString(2, pass);

			ResultSet rs = stmt.executeQuery();
			
			find = rs.next();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return find;
	}
	
	
	
	/*
		Login
	*/
	public static User user_id(String email)
	{
		User u = new User();
		try(Connection con = DbConnection.createConnection())
		{
			PreparedStatement stmt = con.prepareStatement("SELECT id,name FROM so_users WHERE email = ?");

			stmt.setString(1, email);

			ResultSet rs = stmt.executeQuery();
		
			if(rs.next())
			{
				u.uid=rs.getInt("id");
				u.name=rs.getString("name");
			}
				
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return u;
	}
	
	
	
	/*
		Check if the user already exists (to be used for registration)
	*/
	public static boolean exist(String email)
	{
		boolean find = false;
		try(Connection con = DbConnection.createConnection())
		{
			PreparedStatement stmt = con.prepareStatement("SELECT * FROM so_users WHERE email = ?");

			stmt.setString(1, email);

			ResultSet rs = stmt.executeQuery();
			
			find = rs.next();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return find;
	}
	
	
	
	/*
		Register
	*/
	public static boolean register(String name, String email, String pass)
	{
		boolean done = false;
		try(Connection con = DbConnection.createConnection())
		{
			PreparedStatement stmt = con.prepareStatement("INSERT INTO so_users VALUES (sq_users.nextval,?,?,?,0)");

			stmt.setString(1, name);
			stmt.setString(2, email);
			stmt.setString(3, pass);

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
	
}