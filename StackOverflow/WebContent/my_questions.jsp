<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="test.*, java.util.*"%>
<%
	int uid = (int) session.getAttribute("uid");

	List<Question> lq = QuestionMethods.myQuestions(uid);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@ include file="header.jsp" %>


<h2>My Questions</h2>

	<ol>
		<%
			for(Question q : lq)
			{
		%>
			<li>
				<h4><a href="get_question.jsp?id=<%=q.id %>"><%=q.subject %></a></h4>
				<i>Domain: <%=q.domain %></i><br>
				<i>Answers: <%=q.num_answers %></i>
			</li>
		<%
			}
		%>
	</ol>
</body>
</html>