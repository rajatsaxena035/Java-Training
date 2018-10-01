<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<h3>Login To NEC</h3><br/>
<form action="loginDb.jsp" method="post">
	Enter UserName <input type="text" name="username" required><br /><br />
	Enter PassPhrase <input type="password" name="userpass" required><br /><br />
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

</body>
</html>