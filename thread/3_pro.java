class Thread1 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Thread-1");
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error occured");
			
		}
	}
}
class Thread2 extends Thread
{	
		public void run()
		{
			try
			{
				for(int i=1;i<=5;i++)
				{
					System.out.println("Thread-2");
					Thread.sleep(4000);
				}
			}
			catch(Exception e)
			{
				System.out.println("Error occured");
			}
		}
}
class T3
{
	public static void main(String args[])
	{
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		t1.start();
		t2.start();
	}
}
