import java.io.*;
import java.util.*;

class Fibonacci
{
	public static void main(String[] args) {
		int n1=0, n2 =1, terms, count =0 ,sum =0 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms ... : ");
		terms = sc.nextInt();
		

		if (terms<=0)
		{
			System.out.println("Invalid number..");
		}

		else if (terms == 1)
		{
			System.out.println("Fibonacci Series = "+terms+" : ");
			System.out.println(n1);
		}

		else
		{
			System.out.println("Printing Fibonacci Series");
			while(count<terms)
			{
				System.out.print(n1+" ");

				sum = n1+n2;
				n1 =n2;
				n2 = sum;

				count+=1;
			}
		}


	}
}