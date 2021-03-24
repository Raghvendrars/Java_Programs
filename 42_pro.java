import java.util.List;
import java.util.Arrays;
import java.io.*;
public class prog42
{
	public interface SomeSpecialNumber<T>
	{
		public boolean match(T t);
	}
	public class PrimeNumber implements SomeSpecialNumber<Integer>
	{
		@Override
		public boolean match(Integer t)
		{
			for (int i = 2; i < t; ++i)
			{
				if (t % i == 0)
				{
					return false;
				}
			}
			return true;
		}
}
public class EvenNumber implements SomeSpecialNumber<Integer>
{
	@Override
	public boolean match(Integer t)
	{
	return (t % 2 == 0);
	}
}
public class Algorithm
{
	public <T> int count(List<T> list, SomeSpecialNumber<T> s)
	{
		int count = 0;
		for (T type : list)
		{
			if (s.match(type))
			{
			++count;
			}
		}
		return count;
	}
}
public static void main(String[] args)
{
	prog42 tq= new prog42();
	tq.testSpecificElement();
}
public void testSpecificElement()
{
	List<Integer> lst = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	PrimeNumber pn = new PrimeNumber();
	EvenNumber en = new EvenNumber();
	Algorithm a = new Algorithm();
	System.out.println("Count of prime numbers:" + a.count(lst, pn));
	System.out.println("Count of even numbers:" + a.count(lst, en));
}
}
