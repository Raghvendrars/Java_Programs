import java.util.*;

class Armstrong
{
	public static void main(String[] args) {
		int num,temp,rem,cube=0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number ...");
		num = sc.nextInt();
		temp = num;

		while(num>0)
		{
			rem = num%10;
			num = num/10;
			cube = cube+(rem*rem*rem);
		}

		if(temp==cube)
			System.out.println(temp+" is an Armstrong Number");
		else
			System.out.println(temp+" is not an Armstrong Number");
	}
}
