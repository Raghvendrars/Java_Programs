import java.io.*;
class prog41
{
	public static void main(String args[])
	{
	try
	{
		File f = new File("new.txt");
		f.createNewFile();
		FileReader fr = new FileReader(f);
		BufferedReader reader = new BufferedReader(fr);
		int count=0;
		while(reader.readLine() != null)
		{
			count++;
		}
		System.out.println(count);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}
