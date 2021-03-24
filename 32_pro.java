import java.util.*;
class prog32
{
public static void main(String args[])
{
  int no=0;
  Scanner sc=new Scanner(System.in);
  try
  {
    String name;
    System.out.println("enter number");
    name=sc.next();
    prog32 p = new prog32();
    no=Integer.valueOf(name);
    try
    {
      p.method(no);
    }
    catch(ArithmeticException a)
    {
      System.out.println("try again leter");
      System.out.println(a.getMessage());
    }
  }
  catch(NumberFormatException n)
  {
    System.out.println(n.getMessage());
    System.out.println("exception");
  }
}
void method(int num) throws ArithmeticException
{
  if(num == 0)
  {
  throw new ArithmeticException("Number cannot be 0");
  }
  else
  {
  int ans = 50/num;
  System.out.println("ans = "+ans);
  }
}
}
