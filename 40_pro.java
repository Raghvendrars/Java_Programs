import java.io.File; 
import java.io.*;
import java.util.*;
public class prog40
{
	public static void main(String args[])
	{
			try
			{
				File f1=new File("prog40.txt");
				Scanner read = new Scanner(f1);
				while (read.hasNextLine())
				{
					String data = read.nextLine();
					System.out.println(data);
				}
				read.close();
			}
			catch(IOException e)
			{
				System.out.println("Exception occured");
			}
	}
}
