package javasql;

import java.sql.*;

public class OracleCon {
	public static void main(String[] args) throws Exception {
		//register the driver class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//creating class
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		Statement stmt = con.createStatement();
		
		//executing queries
		//stmt.executeUpdate("insert into EmpTbl values(33, 'Emp5', 500000)");
		//int result = stmt.executeUpdate("update Emptbl set name = 'Emp33', salary=70000 where id=33");
		int result = stmt.executeUpdate("delete from emptbl where id=33");
		System.out.println(result+" records affected");
		
		//closing connection
		con.close();
	}
}
