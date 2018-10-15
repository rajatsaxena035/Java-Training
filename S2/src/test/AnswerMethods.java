package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AnswerMethods
{
	
	
	
	/*
 		Get all the answers of a particular question
	*/
	public static List<Answer> getAnswers(int ques_id)
	{
		List<Answer> la = new ArrayList<Answer>();
		
		try(Connection con = DbConnection.createConnection())
		{
			PreparedStatement stmt = con.prepareStatement("SELECT so_answers.content, so_users.name FROM so_answers,so_users WHERE so_users.id = so_answers.user_id AND so_answers.ques_id = ?");

			stmt.setInt(1, ques_id);

			ResultSet rs = stmt.executeQuery();	
			
			while(rs.next())
			{
				Answer a = new Answer();
				
				a.user_name = rs.getString("name");
				a.content = rs.getString("content");
				
				la.add(a);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return la;
	}
	
	
	
	/*
		Submit an answer for a particular question
	*/
	public static boolean submitAnswer(Answer ans)
	{
		boolean done = false;
		try(Connection con = DbConnection.createConnection())
		{
			PreparedStatement stmt = con.prepareStatement("INSERT INTO so_answers VALUES (sq_answers.nextval,?,?,?)");

			stmt.setInt(1, ans.user_id);
			stmt.setInt(2, ans.ques_id);
			stmt.setString(3, ans.content);

			int i = stmt.executeUpdate();

			if (i == 1)
				done = true;
			else
				done = false;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return done;
	}
}