<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NEC Technologies India</title>
</head>
<body style="margin-left:30px; margin-right:30px;">
<center><h1>NEC Technologies India</h1>
<h4>Orchestrating a brighter world</h4></center>
<hr>

<% String n = (String)session.getAttribute("fullname");
   String u = (String)session.getAttribute("username");
%>
<a >Welcome <%=n%></a>
<span style="margin-right:10px; margin-left:10px;">|</span>
<a ><%=u+"@nec.com"%></a>
<span style="margin-right:10px; margin-left:10px;">|</span>
<a href='fetchMail.jsp?action=0'>Inbox</a>
<span style="margin-right:10px; margin-left:10px;">|</span>
<a href='compose.jsp'>Compose</a>
<span style="margin-right:10px; margin-left:10px;">|</span>
<a href='fetchMail.jsp?action=1'>Sent</a>
<span style="margin-right:10px; margin-left:10px;">|</span>
<a href='fetchMail.jsp?action=2'>Draft</a>
<%
	if(u.equals("hr"))
	{
%>
<span style="margin-right:10px; margin-left:10px;">|</span>
<a href='report.jsp'>Contact-Us Report</a>
<%
	}
%>
<span style="margin-right:10px; margin-left:10px;">|</span>
<a href='logout.jsp'>Logout</a>

<hr>
<br>