
 <%@ include file="header.jsp" %>

<h3>Contact NEC</h3><br>
<form action="contactDb.jsp" method="post">
	Name<br>
	<input type="text" name="name" required /><br /><br />
	Email<br>
	<input type="email" name="email" required /><br /><br />
	Message<br/>
	<textarea name="message" rows="10" cols="50" required></textarea><br /><br />
	<input type="submit" value="Submit">
</form>

 <%@ include file="footer.jsp" %>