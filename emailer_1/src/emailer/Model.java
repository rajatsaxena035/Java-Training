package emailer;
import java.sql.*;

class Model
{
	private int choice;
	private num_inbox;
	
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

    public boolean mLoginUser(String username, String password) throws Exception
    {
        Connection con = createConnection();
        PreparedStatement stmt = con.prepareStatement("SELECT * FROM users WHERE username = ? AND password = ?");
        
        stmt.setString(1,username);
        stmt.setString(2,password);
        
        ResultSet rs = stmt.executeQuery();
        return rs.next();
    }

    public boolean mInbox(String username) throws Exception
    {
        Connection con = createConnection();
        PreparedStatement stmt = con.prepareStatement("SELECT COUNT(to_email) FROM emails WHERE to_email = ?");
        
        stmt.setString(1,username+"@emaily.com");
        
        ResultSet rs = stmt.executeQuery();
        rs.next();
        num_inbox = rs.getInt(1);
        mInboxPage(username);
    }

    public boolean mInboxPage(String username) throws Exception
    {
        Connection con = createConnection();
        PreparedStatement stmt = con.prepareStatement("SELECT * FROM emails WHERE to_email = ?");
        
        stmt.setString(1,username+"@emaily.com");
        
        ResultSet rs = stmt.executeQuery();
        return rs.next();
    }

    public boolean mSent(String username) throws Exception
    {
        Connection con = createConnection();
        PreparedStatement stmt = con.prepareStatement("SELECT * FROM emails WHERE from_email = ?");
        
        stmt.setString(1,username+"@emaily.com");
        
        ResultSet rs = stmt.executeQuery();
        return rs.next();
    }

    public boolean mCompose(String username, String to, String sub, String content) throws Exception
    {
        Connection con = createConnection();
        PreparedStatement stmt = con.prepareStatement("INSERT INTO emails VALUES (?,?,?,?) ");
        
        stmt.setString(1,username+"@emaily.com");
        stmt.setString(2,to);
        stmt.setString(3,sub);
        stmt.setString(4,content);
        
        int i = stmt.executeUpdate();
        if(i==1) return true;
        else return false;
    }
}
