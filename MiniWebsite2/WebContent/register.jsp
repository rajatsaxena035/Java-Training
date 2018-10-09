
<%@ include file="header.jsp" %>

<h3>Register In NEC</h3><br/>

<form action="registerDb.jsp" method="post">
	Name<br/>
	<input type="text" name="fullname" required><br /><br />
	Username<br/>
	<input type="text" name="username" required><br /><br />
	PassPhrase<br/>
	<input type="password" name="userpass" required><br /><br />
	Confirm PassPhrase<br/> 
	<input type="password" name="confpass" required><br /><br />
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

<%@ include file="footer.jsp" %>
