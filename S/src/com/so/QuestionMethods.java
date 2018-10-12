package com.so;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class QuestionMethods
{	
	public Question getQuestion(int id)
	{
		Question q = new Question();
		
		try(Connection con = DbConnection.createConnection())
		{
			PreparedStatement stmt = con.prepareStatement("SELECT * FROM so_users WHERE id = ?");

			stmt.setInt(1, id);

			ResultSet rs = stmt.executeQuery();	
			
			if(rs.next())
			{
				q.id = rs.getInt("id");
				q.user_id = rs.getInt("id");
				q.subject = rs.getString("subject");
				q.content = rs.getString("content");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return q;
	}
	
	public boolean searchQuestions(String query)
	{
		return true;
	}
	
	public boolean addQuestion(Question ques)
	{
		return true;
	}
}