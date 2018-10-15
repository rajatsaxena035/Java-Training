<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@ include file="header.jsp" %>

<h2>Ask Question</h2>


<form action="askQuestionController.jsp" method="post">
	Select Domain:<br/>
	<select name="domain">
		<option value="java">Java</option>
		<option value="python">Python</option>
		<option value="cpp">C/C++</option>
		<option value="linux">Linux</optiont>
		<option value="ml">Machine Learning</option>
	</select>
	<br/><br/><br/>
	Enter Subject:<br/>
	<input type="text" name="subject" required />
	
	<br/><br/><br/>
	Enter Content:<br/>
	<textarea name="content" rows="10" cols="50"></textarea>
	
	
	<br/><br/><br/>
	<input type="submit" />
</form>
</body>
</html>