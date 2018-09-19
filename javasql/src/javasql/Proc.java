package javasql;
import java.sql.*;
public class Proc {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//register the driver class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//creating class
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		CallableStatement stmt = con.prepareCall("{call insertR(?,?,?)}");
		
		stmt.setInt(1,85);
		stmt.setString(2,"Richa");
		stmt.setInt(3,212121);
		
		//executing queries
		//stmt.executeUpdate("insert into EmpTbl values(33, 'Emp5', 500000)");
		//int result = stmt.executeUpdate("update Emptbl set name = 'Emp33', salary=70000 where id=33");
		stmt.execute();
		System.out.println("success");
		
		//closing connection
		con.close();
	}

}
