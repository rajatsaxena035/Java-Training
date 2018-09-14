import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

class Main{
	public static final String FILE_PATH = "aaaa.txt";
	public static void main(String[] args) throws IOException {
		RandomAccessFile file = new RandomAccessFile(FILE_PATH,"rw");
		FileChannel channel = file.getChannel();
		ByteBuffer ByteBuffer = ByteBuffer.allocate(48);
		int read = channel.read(byteBuffer.allocate(48));
		int read = channel.read(byteBuffer);
		while(read != -1)
		{
			byteBuffer.flip();
			while(byteBuffer.hasRemaining())
			{
				System.out.println((char)byteBuffer.get());
			}
			byteBuffer.compact();
			read = channel.read(byteBuffer);
		}
		file.close();
	}
}