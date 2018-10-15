<%@page contentType="text/html" pageEncoding="UTF-8" import="test.*, java.util.*"%>

<%
	int uid = (int) session.getAttribute("uid");

	Map<String,Boolean> m = DomainMethods.getDomains(uid);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>e</title>
</head>
<body>

	
	<%@ include file="header.jsp" %>

	<h4>Your Domains</h4>
		<ul>
	<%
		for(Map.Entry<String, Boolean> entry : m.entrySet())
		{
			if(entry.getValue())
			{
	%>
				<li><%=entry.getKey()%></li>
	<%
			}
		}
	%>
	</ul>
	<br>
	<br>
	<br>
	
	<h4>Add More Domains</h4>
	<form>	
	<%
		for(Map.Entry<String, Boolean> entry : m.entrySet())
		{
			if(!entry.getValue())
			{
	%>
				<input type="radio" name="domain"/><%=entry.getKey()%></br></br>
	<%
			}
		}
	%>
	
	<input type="submit" value="Take Quiz" />
	</form>
</body>
</html>