<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script>
function validatePassword(){
		var pass = document.forms["myForm"]["pass"].value;
		if (pass.length < 8) {
			alert("Password should be atleast 8 character long");
			return false;
		}
}
</script>
<body>
	<p>
	
	<%@ include file="search.html" %>
	<hr>
	<br>
	<p>This is index page</p>
	<h3>Login</h3>
	<form method="POST" name="myForm" onSubmit="return validatePassword()">
		
			Email Id:<input type="email" name="email">
		
		
			Password:<input type="password" name="pass">
		<br>
		<input type="submit" value="Login" onclick="form.action='LoginController.jsp';">  
		<br/><br/><a href="Register.jsp">New user Register</a><br><br>
		
	</form>
	
</body>
</html>


