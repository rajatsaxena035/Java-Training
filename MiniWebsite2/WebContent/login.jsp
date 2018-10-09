
<%@ include file="header.jsp" %>

<h3>Login To NEC</h3><br/>
<form action="loginDb.jsp" method="post">
	Enter Username<br/>
	<input type="text" name="username" required><br /><br />
	Enter PassPhrase<br/>
	<input type="password" name="userpass" required><br /><br />
	<input type="submit" value="Login"><br /><br />
</form>

<%
	String error = request.getParameter("error");
	
	if(error!=null && error.equals("credentials"))
	{	
%>
		<div style='color:red;'>* Incorrect Credentials.</div>
<%
	}
%>

<%@ include file="footer.jsp" %>