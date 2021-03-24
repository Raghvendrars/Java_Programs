class T1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=20;i++)
		{
			System.out.println("A");
		}
		System.out.println("Thread-1 finish");
	}
}
class T2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=30;i++)
		{
			System.out.println("B");
		}
		System.out.println("Thread-2 finish");
	}
}
class T3 extends Thread
{
	public void run()
	{
		for(int i=1;i<=15;i++)
		{
			System.out.println("C");
		}
		System.out.println("Thread-3 finish");
	}
}
public class T5
{
	public static void main(String args[])
	{
		T1 t1=new T1();
		T2 t2=new T2();
		T3 t3=new T3();
		t1.start();
		t2.start();
		t3.start();
	}
}
