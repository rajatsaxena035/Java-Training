<%@ page contentType="text/html; charset=ISO-8859-1" %>

<%@ page import="org.json.simple.*, java.io.*" %>

<% 
	JSONObject json = new JSONObject();
	json.put("title","Fantastic Beasts: The crimes of Grindewald");
	json.put("author","JK Rowling");
	json.put("price",20);
	try
	{
		System.out.println("Writing JSON into file...");
		System.out.println(json);
		File jsonFile = new File("D:\\abc.txt");
		FileWriter jsonFileWriter = new FileWriter(jsonFile);
		jsonFileWriter.write(json.toJSONString());
		System.out.println("Path: "+ jsonFile.getAbsolutePath());
		jsonFileWriter.flush();
		jsonFileWriter.close();
		System.out.println("Done");
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
%>