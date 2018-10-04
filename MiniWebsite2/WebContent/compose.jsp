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
Welcome <%=s %> 
<span style="margin-right:10px; margin-left:10px;">|</span>
<a href="welcome.jsp"> Home</a>
<span style="margin-right:10px; margin-left:10px;">|</span>
<a href="logout.jsp"> Logout</a>
<br/><br/>
<h3>Compose Mail</h3>
		<form method="post">
		From: <%=s%>@nec.com <br/><br/>
		To: <input type="text" style="width:50%" placeholder=" Enter comma separated email ids" name="emailIds" required> <br/><br/>
		Subject: <input type="text" style="width:46%" name="subject"> <br/><br/>
		Content:<br/>
		<textarea name="content" rows="5" cols="67"></textarea> <br/><br/>
		<input type="submit" value="Send Mail" formaction="saveMail.jsp?flag=0"/>
		<input type="submit" value="Save Draft" formaction="saveMail.jsp?flag=1"/>
		</form>
<% } %>

</body>
</html>