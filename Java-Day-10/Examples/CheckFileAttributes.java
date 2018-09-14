import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CheckFileAttributes
{
	public static void main(String[] args) {
		Path filePath = Paths.get("aaaa.txt");
		System.out.println("Is file readable: " + Files.isReadable(filePath));
		System.out.println("Is file writable: " + Files.isWritable(filePath));
		System.out.println("Is file executable: " + Files.isExecutable(filePath));

	}
}
