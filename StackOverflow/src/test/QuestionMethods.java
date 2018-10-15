package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class QuestionMethods
{	
	
	
	
	/*
 		Get a particular question
	*/
	public static Question getQuestion(int id)
	{
		Question q = new Question();
		
		try(Connection con = DbConnection.createConnection())
		{
			PreparedStatement stmt = con.prepareStatement("SELECT so_questions.subject, so_questions.domain, so_questions.content, so_users.name FROM so_questions, so_users WHERE so_users.id = so_questions.user_id AND so_questions.id = ?");

			stmt.setInt(1, id);

			ResultSet rs = stmt.executeQuery();	
			
			if(rs.next())
			{
				q.user_name = rs.getString("name");
				q.domain = rs.getString("domain");
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
	
	
	
	/*
 		Search questions based on query
	*/
	public static List<Question> searchQuestions(String query)
	{	
		List<Question> lq = new ArrayList<Question>();
		
		try(Connection con = DbConnection.createConnection())
		{
			PreparedStatement stmt = con.prepareStatement("SELECT id, subject, domain, content FROM so_questions WHERE domain LIKE ? AND lower(subject) LIKE ?");
			
			String arr[] = query.split(" ",2);
			
			stmt.setString(1, "%"+arr[0].toLowerCase()+"%");
			stmt.setString(2, "%"+arr[1].toLowerCase()+"%");
			
			/*System.out.println("0==="+arr[0]);
			System.out.println("1==="+arr[1]);*/
			
			ResultSet rs = stmt.executeQuery();	 
			
			while(rs.next())
			{
				System.out.println("Yes");
				
				Question q = new Question();
				
				q.id = rs.getInt("id");
				
				q.subject = rs.getString("subject");
				q.domain = rs.getString("domain");
				q.content = rs.getString("content");
				
				lq.add(q);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return lq;
	}

	
	
	/*
 		Ask a question
	*/
	public static boolean addQuestion(Question ques)
	{
		boolean done = false;
		try(Connection con = DbConnection.createConnection())
		{
			PreparedStatement stmt = con.prepareStatement("INSERT INTO so_questions VALUES (sq_questions.nextval,?,?,?,?)");

			stmt.setInt(1, ques.user_id);
			stmt.setString(2, ques.domain);
			stmt.setString(3, ques.subject);
			stmt.setString(4, ques.content);

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
	
	
	
	/*
	 	All questions that a particular user has asked
	*/
	public static List<Question> myQuestions(int user_id)
	{	
		List<Question> lq = new ArrayList<Question>();
		
		try(Connection con = DbConnection.createConnection())
		{
			PreparedStatement stmt = con.prepareStatement("SELECT id,domain,subject FROM so_questions WHERE user_id=?");

			stmt.setInt(1, user_id);
			System.out.println("aaaaaa");
			ResultSet rs = stmt.executeQuery();	 
			System.out.println("bbbbb");
			while(rs.next())
			{
				Question q = new Question();
				
				q.id = rs.getInt("id");
				q.subject = rs.getString("subject");
				q.domain = rs.getString("domain");
				
				PreparedStatement stmt2 = con.prepareStatement("SELECT count(id) AS num_answers FROM so_answers WHERE ques_id=?");

				stmt2.setInt(1, q.id);
				System.out.println("cccc");
				ResultSet rs2 = stmt2.executeQuery();
				System.out.println("ddddd");
				if(rs2.next())
				{
					q.num_answers = rs2.getInt("num_answers");
				}
				
				lq.add(q);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return lq;
	}
}