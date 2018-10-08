
<%@ include file="headerMail.jsp" %>

<%
	String s = (String)session.getAttribute("username");
	if(s==null)
	{
		response.sendRedirect("index.jsp");
	}
	else
	{
	
%>


<% } %>

<%@ include file="footer.jsp" %>
