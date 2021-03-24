import java.util.*;
class prog31
{
	public static void main(String args[])
	{
		int a=10;
		prog31 p=new prog31();
		try
		{
			p.check(a,0);
		}
		catch(divideByZero d)
		{
			System.out.println("try something else");
			System.out.println(d.getMessage());
		}
	}
	void check(int a,int b) throws divideByZero
	{
		if(b==0)
		{
			throw new divideByZero("Cannot divide by zero");
		}
	}
}
class divideByZero extends Exception
{
	public divideByZero(String s)
	{
		super(s);
	}
}
