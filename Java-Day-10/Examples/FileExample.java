import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileExample
{
	public static final String FILE_PATH = "test.txt";

	public static void main(String... args) throws IOException
	{
			createFile();
			writeFile();
			countFile();
			copyFile();
			//deleteFile();
	}

	public static void createFile() throws IOException
	{
		File file = new File(FILE_PATH);
		boolean newFile = file.createNewFile();
		if(newFile)
		{
			System.out.println("Create test.txt");
		}
		else
		{
			System.out.println("test.txt already exists");
		}

		boolean mkdirs = file.mkdirs();
		if(mkdirs)
		{
			System.out.println("Create mkdirs");
		}
		else
		{
			System.out.println("mkdirs already exists");
		}

		System.out.println("file name: " + file.getName());
		System.out.println("file path: " + file.getParent());
	}

	public static void writeFile() throws IOException
	{
		File file = new File(FILE_PATH);

		OutputStream outputStream = new FileOutputStream(file);
		String str = "Hello World";
		byte[] bytes = str.getBytes();

		outputStream.write(bytes);
		outputStream.close();
	}

	/*public static void deleteFile()
	{
		File file = new File(FILE_PATH+"_cp");
		if(file.delete())
		{
			System.out.println("delete test.txt_cp success");
		}
	}*/

	public static void countFile() throws IOException
	{
		int count = 0;
		File file = new File(FILE_PATH);

		InputStream inputStream = new FileInputStream(file);

		while(inputStream.read() != -1)
		{
			count++;
		}

		System.out.println(file.getName()+" length : "+count);
		inputStream.close();
	}

	public static void copyFile() throws IOException
	{
		byte[] buffer = new byte[512];
		File file = new File(FILE_PATH);
		InputStream inputStream = new FileInputStream(file);
		File outFile = new File(FILE_PATH + "_cp");

		FileOutputStream outputStream = new FileOutputStream(outFile);

		while(inputStream.read(buffer) != -1)
		{
			outputStream.write(buffer);
		}

		System.out.println("copy "+file.getPath()+" to " + outFile.getPath());

		inputStream.close();
		outputStream.close();
	}
}

