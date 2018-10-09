 <%@ include file="headerMail.jsp" %>
 
<%
	String s = (String)session.getAttribute("username")+"@nec.com";
	if(s==null)
	{
		response.sendRedirect("index.jsp");
	}
	else
	{
	
%>

<h3>Compose Mail</h3><br>
		<form method="post">
		From: <%=s%><br/><br/>
		To<br> 
		<input type="text" style="width:42%" placeholder=" Enter comma separated email ids" name="emailIds" required> <br/><br/>
		Subject<br>
		<input type="text" style="width:42%" name="subject"> <br/><br/>
		Content<br/>
		<textarea name="content" rows="5" cols="67"></textarea> <br/><br/>
		<input type="submit" value="Send Mail" formaction="saveMail.jsp?flag=0"/>
		<input type="submit" value="Save Draft" formaction="saveMail.jsp?flag=1"/>
		</form>
<% } %>

 <%@ include file="footer.jsp" %>