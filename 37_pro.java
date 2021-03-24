import java.io.*;
class prog37
{
	public static void main(String args[])
	{
	try
	{
		BufferedReader br = new BufferedReader(new
		InputStreamReader(System.in));
		System.out.println("enter name: ");
		String name = br.readLine();
		System.out.println("Entered string is: " + name);
	}
	catch(Exception e)
	{
		System.out.println("error");
	}
	}
}
