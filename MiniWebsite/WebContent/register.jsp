<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>
<h3>Register In NEC</h3><br/>

<form action="registerDb.jsp" method="post">
	Choose UserName <input type="text" name="username" required><br /><br />
	Choose PassPhrase <input type="password" name="userpass" required><br /><br />
	Confirm PassPhrase <input type="password" name="confpass" required><br /><br />
	<input type="submit" value="Register"><br /><br />
</form>

<%
	String error = request.getParameter("error");
	if(error!=null)
	{
		if(error.equals("username"))
		{	
%>
			<div style='color:red;'>* This username is already in use.</div>
<%
		}
		else if(error.equals("password"))
		{
%>
			<div style='color:red;'>* Passwords did not match.</div>
<%
		}
	}
%>

</body>
</html>