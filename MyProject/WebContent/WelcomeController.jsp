<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="test.QuestionMethods"%>
<%String domain = request.getParameter("Domain");

boolean flag = QuestionMethods.getQuestion(domain);
if(!flag)
{
	flag = QuestionMethods.getQuestion(id);
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