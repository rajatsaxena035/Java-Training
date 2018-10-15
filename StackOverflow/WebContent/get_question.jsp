<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="test.*, java.util.*"%>
<%
	int qid = Integer.parseInt(request.getParameter("id"));
	
	Question q = QuestionMethods.getQuestion(qid);
	List<Answer> a = AnswerMethods.getAnswers(qid);
	
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
			
	<h4><%=q.subject %></h4>
	<i>Content: <%=q.content %></i><br>
	<i>Domain: <%=q.domain %></i><br>
			
		
</body>
</html>