<!DOCTYPE html>
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
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