<%@ page language="java" import="java.sql.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String username = request.getParameter("username");
	String fullname = request.getParameter("fullname");
	String userpass = request.getParameter("userpass");
	String confpass = request.getParameter("confpass");
	if(!userpass.equals(confpass))
	{
		response.sendRedirect("register.jsp?error=password");
	}
	else
	{
		try
		{
			//register the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			//creating connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			PreparedStatement stmt = con.prepareStatement("SELECT username FROM users WHERE username=?");
			stmt.setString(1,username);
			
			//executing queries
			ResultSet rs = stmt.executeQuery();
			
			
			if(rs.next())
			{
				//closing connection
				con.close();	
				response.sendRedirect("register.jsp?error=username");
			}
			else
			{
				PreparedStatement stmt2 = con.prepareStatement("INSERT INTO users VALUES (?,?,?)");
				stmt2.setString(1,username);
				stmt2.setString(2,userpass);
				stmt2.setString(3,fullname);
				//executing queries
				int result = stmt2.executeUpdate();
				
				//closing connection
				con.close();
				
				if(result==1)
				{
					session.setAttribute("fullname",fullname);
					session.setAttribute("username",username);
					response.sendRedirect("fetchMail.jsp?action=0");
				}
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
%>