import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class sql {
	
	//register the driver class
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	//creating class
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
	Statement stmt = con.createStatement();
	
	//executing queries
	ResultSet rs = stmt.executeQuery("select * from emp");
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+" "+rs.getString(2));
	}
	
	//closing connection
	con.close();
}
