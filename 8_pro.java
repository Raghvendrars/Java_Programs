public class matrixMulti {
    public static void main(String[] args)
    {
        int max1[][]={{2,3,4},{5,6,7}};
        int max2[][]={{2,5},{6,7},{9,4}};
        int res[][]= new int[2][2];

        int sum = 0;
        
        for(int i=0;i<2;i++)
        {
            for (int j = 0; j < 2; j++) 
            {
                for (int k = 0; k < 3; k++) {
                    sum = sum + max1[i][k] * max2[k][j];
                }
                res[i][j] = sum;
                sum = 0;
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
