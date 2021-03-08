import java.util.*;

class Palindrome
{
	public static void main(String[] args) {
		int num,temp,rem,reverse_no =0 ;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to be checked : ");
		num = sc.nextInt();

		temp = num;

		while(num>0)
		{
			rem = num%10;
			reverse_no = (reverse_no*10) +rem;
			num = num/10;
		}

		if(temp==reverse_no)
			System.out.println(temp+ " is a Palindrome number");
		else
			System.out.println(temp+" is not a Palindrome number");
	}
}
