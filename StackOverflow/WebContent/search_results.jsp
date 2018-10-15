<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="test.*, java.util.*"%>
<%
	String query = request.getParameter("query");
	System.out.println("zzzzzz");
	List<Question> lq = QuestionMethods.searchQuestions(query);
	System.out.println("ssss");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="search.html" %>
	<br><br>
	<ol>
		<%
			for(Question q : lq)
			{
		%>
			<li>
				<h4><a href="get_question.jsp?id=<%=q.id %>"><%=q.subject %></a></h4>
				<i>Content: <%=q.content %></i><br>
				<i>Domain: <%=q.domain %></i><br>
			</li>
		<%
			}
		%>
	</ol>
</body>
</html>