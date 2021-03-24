import java.util.*;
class prog33
{
public static void main(String args[])
{
	bank b = new bank(1234,1000);
	b.display();
	b.withdraw(400);
	b.display();
	b.withdraw(300);
	b.display();
	b.withdraw(500);
	b.display();
}
}
class nostorageException extends Exception
{
	public nostorageException(String s)
	{
		super(s);
	}
}
class bank
{
	int bal,ac_no;
	bank(int ac_no,int bal)
	{
		this.ac_no=ac_no;
		this.bal=bal;
	}
	void deposite(int amt)
	{
		bal+=amt;
	}
	void withdraw(int amt)
	{
		try
		{
			check(amt);
			bal-=amt;
		}
		catch(nostorageException n)
		{
			System.out.println("Exception");
			System.out.println(n.getMessage());
		}
	}
	void display()
	{
		System.out.println("account number :- "+ac_no);
		System.out.println("Balace :- "+bal);
	}
	void check(int amt) throws nostorageException
	{
		int temp=bal;
		temp=bal-amt;
		if(temp <= 100)
		{
		throw new nostorageException("Low balance cannot withdraw");
		}
	}
}
