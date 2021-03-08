public class maxNum {
    public static void main(String[] args)
    {
        int num1=10,num2=25,num3=12,num4=20;

        if(num1>num2 && num1>num3 && num1>num4)
        {
            System.out.println("Num 1 is Greater");
        }
        else if(num2>num1 && num2>num3 && num2>num4)
        {
            System.out.println("Num 2 is Greater");

        }
        else if(num3>num1 && num3>num2 && num3>num4)
        {
            System.out.println("Num 3 is Greater");

        }
        else {
            System.out.println("Num 4 is Greater");

        }
    }
}
 
