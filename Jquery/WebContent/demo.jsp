<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	
		String album_name, album_artist;
		album_name = request.getParameter("name");
		album_artist = request.getParameter("artist");
		
		out.println(album_name + "==\n==" + album_artist);
	
	%>
</body>
</html>