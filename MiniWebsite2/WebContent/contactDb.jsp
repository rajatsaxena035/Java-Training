<%@ page language="java" import="java.sql.*, com.website.JavaEmail" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String message = request.getParameter("message");
	
	//register the driver class
	Class.forName("oracle.jdbc.driver.OracleDriver");

	//creating connection
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
	
	//prepare query
	PreparedStatement stmt = con.prepareStatement("INSERT INTO contacts VALUES (?,?,?) ");
	
	stmt.setString(1, name);
	stmt.setString(2, email);
	stmt.setString(3, message);


	int res = stmt.executeUpdate();
	
	//close connection
	con.close();
	
	try
	{
		JavaEmail.main();	
	}
	catch(Exception e)
	{
		System.out.println("Mailing Error hai");
	}
	
	response.sendRedirect("index.jsp");

%>