<%@ page language="java" import="java.sql.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String from = (String)session.getAttribute("username");
	String emailIds = request.getParameter("emailIds");
	String[] to_array = emailIds.split(",");
	String subject = request.getParameter("subject");
	String content = request.getParameter("content");
	int flag = Integer.parseInt(request.getParameter("flag"));
	
	//register the driver class
	Class.forName("oracle.jdbc.driver.OracleDriver");

	//creating connection
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
	
	//prepare query
	PreparedStatement stmt = con.prepareStatement("INSERT INTO emails VALUES (?,?,?,?,?) ");
	
	for (int i = 0; i < to_array.length;)
	{
		to_array[i] = to_array[i].trim();

		stmt.setString(1, to_array[i]);
		stmt.setString(2, from);
		stmt.setString(3, subject);
		stmt.setString(4, content);
		stmt.setInt(5, flag);

		int res = stmt.executeUpdate();
		if(res==1) i++;
	}
	
	//close connection
	con.close();
	
	response.sendRedirect("fetchMail.jsp?action=1");

%>