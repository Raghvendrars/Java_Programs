class A{
    static int Name=10;
}

class B extends A{
     int Name=23;

    void display(){
        System.out.println("This is Sub class: "+Name); 
        System.out.println("This is Super Class: "+super.Name); 
    }
    

    public static void main(String[] args){
        B  b= new B();
        b.display();
    }
}
