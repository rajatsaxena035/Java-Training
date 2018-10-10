<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="org.json.simple.*, java.io.*, org.json.simple.parser.*" %>

<%
	JSONParser parser = new JSONParser();
	try
	{
		System.out.println("Reading JSON file");
		File file = new File("D:\\abc");
		FileReader fileReader = new FileReader(file);
		JSONObject json = (JSONObject)parser.parse(fileReader);
		System.out.println(json);
		out.print(json);
		String title = "<br> Title: "+(String) json.get("title");
		out.print(title);
		String author = "<br> Author: "+(String) json.get("author");
		out.print(author);
		String price = "<br> Price: "+(String) json.get("price");
		out.print(price);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
%>