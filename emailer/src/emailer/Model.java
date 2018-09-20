package emailer;
import java.sql.*;

class Model {
	private int choice;
	
	public static Connection createConnection() throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		return con;
	}
	public void setChoice(int choice)
	{
		this.choice=choice;
	}
	public int getChoice()
	{
		return choice;
	}
	
	public boolean mExistsUsername(String username) throws Exception
	{
		Connection con = createConnection();
		PreparedStatement stmt = con.prepareStatement("select username from users where username = ?");
		
		stmt.setString(1,username);
		ResultSet rs = stmt.executeQuery();
		return rs.next();
	}
	
	public boolean mCreateUser(String username, String password) throws Exception
    {
        Connection con = createConnection();
        PreparedStatement stmt = con.prepareStatement("INSERT INTO users VALUES (?,?)");
        
        stmt.setString(1,username);
        stmt.setString(2,password);
        
        int i = stmt.executeUpdate();
        if(i==1) return true;
        else return false;
    }

}
