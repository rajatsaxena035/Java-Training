<%@ include file="headerMail.jsp" %>

<%@ page import="java.sql.*" %>
 
<%
	String s = (String)session.getAttribute("username");
	if(s==null)
	{
		response.sendRedirect("index.jsp");
	}
	else
	{
	
%>

    
<%
	//register the driver class
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	//creating connection
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
	
	try
	{
		String label = "";
		PreparedStatement stmt=null;
		String own_mail = (String)session.getAttribute("username");
		
		out.print("<h3>Report</h3><br>");
		label="Name";
		stmt = con.prepareStatement("SELECT * FROM contacts");
		
%>


<table style="border: 1px solid blue; width:100%">
	
	<tr>
		<th style='border: 1px solid blue;'>Name</th>
		<th style='border: 1px solid blue;'>Email</th>
		<th style='border: 1px solid blue;'>Message</th>
	</tr>
<%
		
		//executing queries
		ResultSet rs = stmt.executeQuery();
		int k=0;
		while(rs.next())
		{
			k++;
			out.print("<tr>");
			out.print("<td style='border: 1px solid blue;'>"+rs.getString("name")+"</td>");
			out.print("<td style='border: 1px solid blue;'>"+rs.getString("email")+"</td>");
			out.print("<td style='border: 1px solid blue;'>"+rs.getString("message")+"</td>");
			out.print("</tr>");
		}
		out.print("</table>");
		if(k==0) out.print("<br/><br/>No mails here.");
	}
	catch(Exception e)
	{
		System.out.println(e);		
	}
	finally
	{
		con.close();
	}
	}
%>    

<%@ include file="footer.jsp" %>
