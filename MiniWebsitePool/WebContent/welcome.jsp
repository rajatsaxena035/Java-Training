<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
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

<span style="margin-right:10px; margin-left:10px;">|</span>
<a href="logout.jsp"> Logout</a>
<br/><br/>
Your email is <%=s%>@nec.com
<ul>
<li><a href='compose.jsp'>Compose</a></li>
<li><a href='fetchMail.jsp?action=0'>Inbox</a></li>
<li><a href='fetchMail.jsp?action=1'>Sent</a></li>
<li><a href='fetchMail.jsp?action=2'>Draft</a></li>
</ul>

<% } %>

</body>
</html>