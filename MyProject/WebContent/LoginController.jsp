<%@page contentType="text/html" pageEncoding="UTF-8" import="test.UserMethods"%>

<%String email = request.getParameter("email");
String pass = request.getParameter("pass");
boolean flag = UserMethods.login(email,pass);

if(flag==true)
{
	response.sendRedirect("Welcome.jsp");
}
else
{
	response.sendRedirect("index.jsp");
}
%>
