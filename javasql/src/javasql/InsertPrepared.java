package javasql;
import java.sql.*;
public class InsertPrepared {
	public static void main(String[] args) throws Exception {
		//register the driver class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//creating class
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		PreparedStatement stmt = con.prepareStatement("insert into Emptbl values(?,?,?)");
		
		stmt.setInt(1,84);
		stmt.setString(2,"Rajat");
		stmt.setInt(3,12121212);
		
		//executing queries
		//stmt.executeUpdate("insert into EmpTbl values(33, 'Emp5', 500000)");
		//int result = stmt.executeUpdate("update Emptbl set name = 'Emp33', salary=70000 where id=33");
		int result = stmt.executeUpdate();
		System.out.println(result+" records affected");
		
		//closing connection
		con.close();
	}
}
