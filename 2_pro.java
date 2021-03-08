import java.util.*;

class Prime
{
	public static void main(String[] args) {
		int num, flag =0, m=0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check : ");
		num = sc.nextInt();

		m = num/2;

		if(num<=0 || num == 1)
		{
			System.out.println(num+" Is Not Prime");
		}

		/*else if (num == 2){
			System.out.println(num+" Is a Prime Number!!");
		}
*/
		else
		{
			for(int i=2;i<=m;i++)
			{
				if(num%i==0)
				{
					System.out.println(num+ " Is Not Prime...");
					flag = 1;
					
					break;
				}
			}
			
			if (flag==0)
			{
				System.out.println(num+" Is a Prime Number!!");
			}
		}
	}
}
