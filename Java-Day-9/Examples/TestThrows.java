import java.io.IOException;
class Testthrows1
{
	void m() throws IOException
	{
		throw new IOException("device error");
	}

	void n() throws IOException
	{
		m();
	}
}