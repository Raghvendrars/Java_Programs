class Counter
{
	int c=0;

	synchronized void increment()
	{
		c++;
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("caught: " + e);
		}
		System.out.println("C = " + c);
	}
}

class NewThread extends Thread
{
	Counter obj;
	NewThread(Counter o)
	{
		obj = o;
	}
	public void run()
	{
		obj.increment();
	}
}

public class T6
{
	public static void main(String[] args)
	{
		Counter c1 = new Counter();
		NewThread t1 = new NewThread(c1);
		t1.start();
		NewThread t2 = new NewThread(c1);
		t2.start();
		NewThread t3 = new NewThread(c1);
		t3.start();
	}
}
