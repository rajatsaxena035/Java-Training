<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="myScript.js"></script>
<script>
function validatePassword(){
		var pass = document.forms["myForm"]["pass"].value;
		var cpass = document.forms["myForm"]["cpass"].value;
// 		var ph_number = document.forms["myForm"]["phno"].value;
//  		if(ph_number.length != 10){
//  			alert("Number shuld be of atleast 10 digits.");
//  			return false;
// 		}
		if (pass!=cpass) {
			alert("Password Missmatch!!!!");
			return false;
		}else if (pass.length < 8) {
			alert("Password should be atleast 8 character long");
			return false;
		}
}
</script>
</head>
<body>

<%@ include file="search.html" %>
	<hr><br>


<b>Register User</b>

<form method="POST" name="myForm" action="RegisterController.jsp" onSubmit="return validatePassword()">
<p>Full Name:<input type="text" name="name"></p>
<p>E-mail ID:<input type="email" name="email"></p>
<p>Password:<input type="password" name="pass"></p>
<p>Confirm Password:<input type="password" name="cpass"></p>
<p><input type="submit" value="Register"></p>
</form>

</body>
</html>