<%@page contentType="text/html" pageEncoding="UTF-8" import="test.*"%>

<%
String email = request.getParameter("email");
String pass = request.getParameter("pass");
boolean flag = UserMethods.login(email,pass);

if(flag)
{
	User u = UserMethods.user_id(email);
	session.setAttribute("uid",u.uid);
	session.setAttribute("name",u.name);
	
	response.sendRedirect("Welcome.jsp");
}
else
{
	response.sendRedirect("index.jsp");
}
%>

