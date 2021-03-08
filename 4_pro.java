public class powerfun {
    public static void main(String[] args) {
        // Scanner use krna ho to kr lena
        int number = 2, p = 2;
        long result = 1;

        int i = p;
        for (;i != 0; --i)
        {
            result *= number;
        }
       
        System.out.println(number+"^"+p+" = "+result);
    }
}
