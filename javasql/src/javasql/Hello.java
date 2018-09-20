package javasql;

import java.sql.*;

public class Hello {
	public static void main(String[] args)
	{
		try {
			//register the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//creating connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			Statement stmt = con.createStatement();
			
			//executing queries
			ResultSet rs = stmt.executeQuery("select * from emptbl");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			
			//closing connection
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
