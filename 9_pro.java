public class matrix {
    public static void main(String[] args)
    {
        int m1[][] = { { 11, 12, 13 }, { 14, 15, 16 } };
        int m2[][] = { { 7, 8 }, { 9, 5 }, { 4, 6 } };

        int res[][] = new int[2][2];
        int sum = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                res[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    sum = sum + m1[i][k] * m2[k][j];
                }
                res[i][j] = sum;
                sum = 0;
                System.out.print(res[i][j] + " "); //printing matrix element  
            }
            System.out.println();  
        }
        
    }
    
}
