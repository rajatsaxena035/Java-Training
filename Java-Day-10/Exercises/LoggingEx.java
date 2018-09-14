import java.io.*;
import java.util.Scanner;
import java.util.Date;
public class LoggingEx
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			
			Date dateObj = new Date();
			String date = dateObj.toString();     
			
			String log_text = name + " - " + date + System.getProperty("line.separator");

			System.out.println("Hello " + log_text);

			logToFile(log_text);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	public static void logToFile(String log_text) throws IOException
	{
		File to_file = new File("log.txt");

		FileOutputStream to = null;

		try
		{
			to = new FileOutputStream(to_file,true);
			byte[] buffer = log_text.getBytes();
			int bytes_read=buffer.length;
			
			to.write(buffer,0,bytes_read);
		}
		finally
		{
			if(to != null)
				try
				{
					to.close();

				}
				catch(IOException e) {;}
		}
	}
}
