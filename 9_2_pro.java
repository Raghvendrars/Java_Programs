public class matrixSum
{
	public static void main(String[] args) {
		int max1[][]={{2,3,4},{5,6,7},{5,8,9}};
		for (int i = 0; i < 3; i++) {
			int sum = 0;
			for (int j = 0; j < 3; j++) {
				sum +=max1[i][j];
			}
			System.out.print("\nSum of row "+(i+1)+" : "+sum);
		}
	}
}
