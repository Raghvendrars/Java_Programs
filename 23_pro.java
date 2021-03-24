abstract  class Shape{
    int length=10, width=20;

    void area(int A){

        A=length*width;
    }
}

class Triangle extends Shape{
    int base=10;
    int height=20;
    int at=0;
    void area(){

        at= (base*height)/2;

    }

    void display(){
        System.out.println("Area of Triangle is: "+at);
    }

}

class Rectangle extends Shape{

    int length=10;
    int width=20;
    int ar=0;
    void area(){
        ar=width*length;
    }

    void display(){
        System.out.println("Area of Rectangle is: "+ar);
    }
}

class Circle extends Shape{

    float pie=3.14f;
    int radius=10;
    float ac,totalarea;
    void area(){
        ac=(radius*radius);
        totalarea=ac*pie;
    }

    void display(){
        System.out.println("Area of Circle is: "+totalarea);
    }
}

class maincls{
    public static void main(String[] args) {
        Triangle obj = new Triangle();
        obj.area();
        obj.display();
        Rectangle obj1= new Rectangle();
        obj1.area();
        obj1.display();
        Circle obj2= new Circle();
        obj2.area();
        obj2.display();

    }
}