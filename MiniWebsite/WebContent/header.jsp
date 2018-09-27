<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String s = (String)session.getAttribute("username");
	if(s==null)
	{
		response.sendRedirect("index.jsp");
	}
	else
	{
	
%>
Welcome <%=s%> 
<span style="margin-right:10px; margin-left:10px;">|</span>  <a href="logout.jsp"> Logout</a>
<br/><br/>
