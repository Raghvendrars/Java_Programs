class Thread1 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("I'm in Thread-1");
		}
		System.out.println("Thread-1 finish");
	}
}
class Thread2 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("I'm in Thread-2");
		}
		System.out.println("Thread-2 finish");
	}
}
public class T2
{
	public static void main(String args[])
	{
		//Thread1 t1=new Thread1();
		//Thread2 t2=new Thread2();
		Thread tt=new Thread(new Thread1());
		Thread ttt=new Thread(new Thread2());
		tt.start();
		ttt.start();
	}
}
		
