import java.util.*;
public class prog43{
	public static void main(String ar[])
	{
		int max=0;
		List<Integer> rs=new ArrayList<>();
		rs.add(10);
		rs.add(11);
		rs.add(12);
		rs.add(13);
		rs.add(9);
		for(int i=0;i<rs.size();i++)
		{
			System.out.println("Value of index "+" "+i+" : "+rs.get(i));
		}
		System.out.println("Enter the index of two elements to be swapped\n");
		System.out.println("Enter first index");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter second index");
		int c=rs.get(a);
		int b=sc.nextInt();
		rs.set(a,rs.get(b));
		rs.set(b,c);
		System.out.println("---------------After Swapping-------------");
		for(int i=0;i<rs.size();i++)
		{
			System.out.println("Value of index "+" "+i+" : "+rs.get(i));
		}
	 }
}
