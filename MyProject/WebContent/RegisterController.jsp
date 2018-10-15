<%@page contentType="text/html" pageEncoding="UTF-8" import="test.UserMethods"%>

<%String email = request.getParameter("email");
String name = request.getParameter("name");
String pass = request.getParameter("pass");
boolean flag = UserMethods.exist(email);
if(!flag)
{
	flag = UserMethods.register(name,email,pass);
	if(flag)
	{
		response.sendRedirect("Welcome.jsp");
	}
	else
	{
		response.sendRedirect("Register.jsp");
	}		
}
else
{
	response.sendRedirect("Register.jsp");
}
%>