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
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr2","hr2");
		PreparedStatement stmt = con.prepareStatement("SELECT username FROM users WHERE username=? AND password=?");
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
			//closing connection
			con.close();
			
			session.setAttribute("username",username);
			response.sendRedirect("welcome.jsp");
			
		}
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
%>