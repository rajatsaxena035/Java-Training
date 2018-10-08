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
		int action = Integer.parseInt(request.getParameter("action"));
		String label = "";
		PreparedStatement stmt=null;
		String own_mail = (String)session.getAttribute("username");
		if(action==0)
		{
			out.print("<h3>Inbox Mails</h3><br>");
			label="From";
			stmt = con.prepareStatement("SELECT from_email as email,subject,content FROM emails WHERE to_email=? AND flag=0");
		}
		else if(action==1 || action==2)
		{
			if(action==1) out.print("<h3>Sent Mails</h3><br>");
			else if(action==2) out.print("<h3>Draft Mails</h3><br>");
			label="To";
			stmt = con.prepareStatement("SELECT to_email as email,subject,content FROM emails WHERE from_email=? AND flag=?");
			stmt.setInt(2,action-1);
		}
		else
		{
			con.close();
			
			response.sendRedirect("welcome.jsp");	
		}
		
		stmt.setString(1,own_mail);
		
%>


<table style="border: 1px solid blue; width:100%">
	
	<tr>
		<th style='border: 1px solid blue;'><%=label%></th>
		<th style='border: 1px solid blue;'>Subject</th>
		<th style='border: 1px solid blue;'>Content</th>
	</tr>
<%
		
		//executing queries
		ResultSet rs = stmt.executeQuery();
		int k=0;
		while(rs.next())
		{
			k++;
			out.print("<tr>");
			out.print("<td style='border: 1px solid blue;'>"+rs.getString("email")+"</td>");
			out.print("<td style='border: 1px solid blue;'>"+rs.getString("subject")+"</td>");
			out.print("<td style='border: 1px solid blue;'>"+rs.getString("content")+"</td>");
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
