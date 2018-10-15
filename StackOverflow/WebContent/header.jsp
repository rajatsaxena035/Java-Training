<%@ include file="search.html" %>
	<hr>

	<h3>Welcome <%=session.getAttribute("name") %></h3>
	
	<p>
		<a href="Welcome.jsp">Home</a> <br>
		<a href="ask_question.jsp">Ask Questions</a> <br>
		<a href="my_questions.jsp">My Questions</a> <br>
		<a href="add_domain.jsp">Domains</a> <br>
		<a href="logout.jsp">Logout</a> <br>
	</p>
	<hr>