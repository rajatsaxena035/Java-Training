<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--
	Integer count = (Integer)session.getAttribute("COUNT");
	if(count == null)
	{
		count = new Integer(1);
		session.setAttribute("COUNT", count);
	}
	else
	{
		count = new Integer(count.intValue()+1);
		session.setAttribute("COUNT", count);
	}
	out.println("<b>Hello you have visited this site:"+count+"times.</b>");
--%>
<%--! int count=0; --%>
<%--
	count++;
	out.println("<b>Hello you have visited this site:"+count+"times.</b>");
--%>
<%! int fontSize; %>
<% 
	for(fontSize=1; fontSize<=3; fontSize++)
	{
%>
<font color="green" size="<%=fontSize %"></font>
<%
	}
%>
</body>
</html>