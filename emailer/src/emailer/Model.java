package emailer;

import java.sql.*;
import java.util.*;

class Model {
	private int choice;

	public static Connection createConnection() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		return con;
	}

	/*
	 * public void setChoice(int choice) { this.choice=choice; } public int
	 * getChoice() { return choice; }
	 */

	public boolean mExistsUsername(String username) throws Exception {
		Connection con = createConnection();
		PreparedStatement stmt = con.prepareStatement("select username from users where username = ?");

		stmt.setString(1, username);
		ResultSet rs = stmt.executeQuery();

		return rs.next();
	}

	public boolean mCreateUser(String username, String password) throws Exception {
		Connection con = createConnection();
		PreparedStatement stmt = con.prepareStatement("INSERT INTO users VALUES (?,?)");

		stmt.setString(1, username);
		stmt.setString(2, password);

		int i = stmt.executeUpdate();

		if (i == 1)
			return true;
		else
			return false;
	}

	public boolean mLoginUser(String username, String password) throws Exception {
		Connection con = createConnection();
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM users WHERE username = ? AND password = ?");

		stmt.setString(1, username);
		stmt.setString(2, password);

		ResultSet rs = stmt.executeQuery();

		return rs.next();
	}

	public List<List<String>> mInbox(String username) throws Exception {
		Connection con = createConnection();
		PreparedStatement stmt = con
				.prepareStatement("SELECT from_email,subject,content FROM emails WHERE to_email=? AND flag=? ");

		String to_email = username + "@emaily.com";
		// System.out.println("to_email="+to_email);
		stmt.setString(1, to_email);
		stmt.setInt(2, 0);

		ResultSet rs = stmt.executeQuery();
		int columns = 3;
		List<List<String>> rows = new ArrayList<List<String>>();

		while (rs.next()) {
			List<String> row = new ArrayList<String>(columns);
			for (int i = 1; i <= columns; ++i) {
				row.add(rs.getString(i));
			}
			rows.add(row);
		}

		return rows;
	}

	// 0 = sent, 1 = draft
	public List<List<String>> mSent(String username) throws Exception {
		Connection con = createConnection();
		PreparedStatement stmt = con
				.prepareStatement("SELECT to_email,subject,content FROM emails WHERE from_email=? AND flag=? ");

		String from_email = username + "@emaily.com";
		// System.out.println("to_email="+to_email);
		stmt.setString(1, from_email);
		stmt.setInt(2, 0);

		ResultSet rs = stmt.executeQuery();
		int columns = 3;
		List<List<String>> rows = new ArrayList<List<String>>();

		while (rs.next()) {
			List<String> row = new ArrayList<String>(columns);
			for (int i = 1; i <= columns; ++i) {
				row.add(rs.getString(i));
			}
			rows.add(row);
		}

		return rows;
	}

	public List<List<String>> mDraft(String username) throws Exception {
		Connection con = createConnection();
		PreparedStatement stmt = con
				.prepareStatement("SELECT to_email,subject,content FROM emails WHERE from_email=? AND flag=? ");

		String from_email = username + "@emaily.com";
		// System.out.println("to_email="+to_email);
		stmt.setString(1, from_email);
		stmt.setInt(2, 1);

		ResultSet rs = stmt.executeQuery();
		int columns = 3;
		List<List<String>> rows = new ArrayList<List<String>>();

		while (rs.next()) {
			List<String> row = new ArrayList<String>(columns);
			for (int i = 1; i <= columns; ++i) {
				row.add(rs.getString(i));
			}
			rows.add(row);
		}

		return rows;
	}

	// 0 = sent, 1 = draft
	public boolean mNew(String username, String[] to, String sub, String content, int flag) throws Exception {
		Connection con = createConnection();
		int i = 0;
		for (String one : to) {
			PreparedStatement stmt = con.prepareStatement("INSERT INTO emails VALUES (?,?,?,?,?) ");

			stmt.setString(1, one);
			stmt.setString(2, username + "@emaily.com");
			stmt.setString(3, sub);
			stmt.setString(4, content);
			stmt.setInt(5, flag);

			i = stmt.executeUpdate();
		}

		if (i == 1)
			return true;
		else
			return false;
	}
}
