class WrapperClass{

public static void main(String[] args) {
    
    int a=2;
    double b=60.0D;  
    char c='r';
    short d=10;
    float e=50.0F;
    long f=40;
    byte g=20;



    // Wrapper class

    Integer k=Integer.valueOf(a);
    Double l=Double.valueOf(b);
    Character m=Character.valueOf(c);
    Short n = Short.valueOf(d);
    Float o=Float.valueOf(e);
    Long p=Long.valueOf(f);
    Byte q=Byte.valueOf(g);
    
    // Printing the vlaues

    System.out.println(k);
    System.out.println(l);
    System.out.println(m);
    System.out.println(n);
    System.out.println(o);
    System.out.println(p);
    System.out.println(q);
}


}
