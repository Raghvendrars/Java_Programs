import java.io.*;
public class prog38
{
	public static void main(String args[])
	{
	try
	{
	BufferedReader br = new BufferedReader(new
	InputStreamReader(System.in));
	System.out.println("enter file name");
	String fname=br.readLine();
	System.out.println(fname);
	File f = new File(fname);
	if(f.exists())
	{
		System.out.println("File Exists");
	}
	else
	{
		System.out.println("File does NOT exist");
	}
	}
	catch(Exception e)
	{
		System.out.println("error");
	}
	}
}
