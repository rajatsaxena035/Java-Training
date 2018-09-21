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
	/*public void setChoice(int choice)
	{
		this.choice=choice;
	}
	public int getChoice()
	{
		return choice;
	}*/
	
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
        PreparedStatement stmt = con.prepareStatement("SELECT * FROM emails WHERE to_email = ? AND flag = ?");
        
        stmt.setString(1,username+"@emaily.com");
        stmt.setInt(2,0);
        
        ResultSet rs = stmt.executeQuery();
        columns = 4;
        List<List<String>> rows = new ArrayList<List<String>>();
    	
    	while (rs.next())
    	{
        	List<String> row = new ArrayList<String>(columns);
	        for(int i = 1; i <= columns; ++i)
	        {
	            row.add(rs.getString(i));
	        }
	        rows.add(row);
    	}
    	return rows;
	}

	// 0 = sent, 1 = draft
    public boolean mSent(String username, int flag) throws Exception
    {
        Connection con = createConnection();
        PreparedStatement stmt = con.prepareStatement("SELECT * FROM emails WHERE from_email = ? AND flag = ?");
        
        stmt.setString(1,username+"@emaily.com");
        stmt.setInt(2,flag);

        ResultSet rs = stmt.executeQuery();
        columns = 4;
        List<List<String>> rows = new ArrayList<List<String>>();
    	
    	while (rs.next())
    	{
        	List<String> row = new ArrayList<String>(columns);
	        for(int i = 1; i <= columns; ++i)
	        {
	            row.add(rs.getString(i));
	        }
	        rows.add(row);
    	}
    	return rows;
    }

    // 0 = sent, 1 = draft
    public boolean mNew(String username, String to, String sub, String content, int flag) throws Exception
    {
        Connection con = createConnection();
        PreparedStatement stmt = con.prepareStatement("INSERT INTO emails VALUES (?,?,?,?,?) ");
        
        stmt.setString(1,username+"@emaily.com");
        stmt.setString(2,to);
        stmt.setString(3,sub);
        stmt.setString(4,content);
        stmt.setString(5,flag);
        
        int i = stmt.executeUpdate();
        if(i==1) return true;
        else return false;
    }
}
