public class minNum {
    public static void main(String[] args) {
        int a = 100, b = 180, c = 20;
        if (a < b && a < c) {
            System.out.println("A is lowest");

        }
        else if (b < a && b < c) {
            System.out.println("B is lowest");

        }
        else {
            System.out.println("C is lowest");
        }
    }
}
