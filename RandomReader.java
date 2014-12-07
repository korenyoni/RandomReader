import java.io.PrintStream;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.StringBuilder;

public class RandomReader
{
	public static void main(String[] args) throws IOException
	{
		File inputFile = new File("/dev/random");
		FileInputStream input = new FileInputStream(inputFile);

		for (int i = 0; i < 5; i++)
		{

			byte fileContent[] = new byte[512];
			//System.out.println(inputFile.length());
			input.read(fileContent, 0, 512);


			//System.out.println(fileContent);
			StringBuilder builder = new StringBuilder();
			for (byte e : fileContent)
			{
				builder.append((char)e);
			}

			for (int n = 0; n < builder.toString().length(); n++)
			{
				String outputString = builder.toString().substring(n, n + 1);
				if (outputString.matches("\\w"))
				{
					System.out.print(outputString);
				}
			}

		}

		System.out.println();

		
	}
}