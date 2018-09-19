package javasql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class FetchRecords {
	public static void main(String[] args) throws Exception
	{
		//register the driver class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//creating class
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		con.setAutoCommit(false);
		
		Statement stmt = con.createStatement();
		
		stmt.executeUpdate("insert into EmpTbl values(190,'abhi', 4000000)");
		stmt.executeUpdate("insert into EmpTbl values(191,'abha', 4000000)");
		
		//con.commit();
		
		//executing queries
		//stmt.executeUpdate("insert into EmpTbl values(33, 'Emp5', 500000)");
		//int result = stmt.executeUpdate("update Emptbl set name = 'Emp33', salary=70000 where id=33");
		//int result = stmt.executeUpdate("delete from emptbl where id=33");
		//System.out.println(result+" records affected");
		
		//closing connection
		con.close();
	}
}
