package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection
{
	public static Connection createConnection() throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		return con;
	}
}
