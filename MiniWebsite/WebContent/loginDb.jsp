<%@ page language="java" import="java.sql.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String username = request.getParameter("username");
	String userpass = request.getParameter("userpass");

	try
	{
		//register the driver class
		Class.forName("oracle.jdbc.driver.OracleDriver");
	
		//creating connection
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		PreparedStatement stmt = con.prepareStatement("SELECT fullname FROM users WHERE username=? AND password=?");
		stmt.setString(1,username);
		stmt.setString(2,userpass);
		
		//executing queries
		ResultSet rs = stmt.executeQuery();
		
		
		if(!rs.next())
		{
			//closing connection
			con.close();
			
			response.sendRedirect("login.jsp?error=credentials");
		}
		else
		{
			session.setAttribute("fullname",rs.getString("fullname"));
			session.setAttribute("username",username);
			
			//closing connection
			con.close();
			
			response.sendRedirect("fetchMail.jsp?action=0");
			
		}
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
%>