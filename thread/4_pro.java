class Thread1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even numbers are= "+i);
			}
		}
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=7;i++)
		{
			if(i%2!=0)
			{
				System.out.println("Odd numbers are= "+i);
			}
		}
	}
}
class T4
{
	public static void main(String args[])
	{
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		t1.start();
		t2.start();
	}
}
