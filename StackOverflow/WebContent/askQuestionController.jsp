<%@page contentType="text/html" pageEncoding="UTF-8" import="test.*"%>

<%

int uid = (int)session.getAttribute("uid");
String domain = request.getParameter("domain");
String subject = request.getParameter("subject");
String content = request.getParameter("content");

Question ques = new Question();

ques.user_id = uid;
ques.domain = domain;
ques.subject = subject;
ques.content = content;

boolean flag = QuestionMethods.addQuestion(ques);

if(flag)
{
	response.sendRedirect("Welcome.jsp");
}
else
{
	response.sendRedirect("ask_question.jsp");
}
%>
