import java.io.*;
public class MakeClass
{
	public static void main(String[] args)
	{
		if(args.length != 1)
			System.out.println("Usage: java FileCopy <source>");
		else
		{
			try
			{
				String name_java = args[0];
				System.out.println(name_java);


				String name_class = name_java.split("\\.")[0] + ".class";
				System.out.println(name_class);
				copy(name_java, name_class);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

	public static void copy(String from_name, String to_name) throws IOException
	{
		File from_file = new File(from_name);
		File to_file = new File(to_name);

		FileInputStream from = null;
		FileOutputStream to = null;

		try
		{
			from = new FileInputStream(from_file);
			to = new FileOutputStream(to_file);
			byte[] buffer = new byte[4096];
			int bytes_read;
			while((bytes_read = from.read(buffer))!=-1)
				to.write(buffer,0,bytes_read);
		}
		finally
		{
			if(from != null || to != null)
				try
				{
					from.close();
					to.close();

				}
				catch(IOException e) {;}
		}
	}
}
