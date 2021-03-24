package CPack;
import APack.*;
public class C
{
	public void display()
	{
		System.out.println("C----------------------------C");
		A obj = new A();		
		System.out.println("protected x : "+obj.getX());		
		System.out.println("private y : "+obj.getY());
		System.out.println("public z : "+obj.getZ());
		System.out.println("C----------------------------C\n");
	}
}
