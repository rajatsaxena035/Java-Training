<%@page contentType="text/html" pageEncoding="UTF-8" import="test.QuestionMethods"%>

<%String ques = request.getParameter("ques");
boolean flag = QuestionMethods.searchQuestions(List<ques>(), '1');

if(flag==true)
{
	response.sendRedirect("Welcome.jsp");
}
else
{
	response.sendRedirect("index.jsp");
}
%>
