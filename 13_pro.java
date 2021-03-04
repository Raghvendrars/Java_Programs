
class Student {

    int enrollment, marks;
    String name, gender;
    static int objectCount=0;


    Student(String n,String g, int en, int m ){
        this.enrollment=en;
        this.marks=m;
        this.name=n;
        this.gender=g;
        this.objectCount++;
    }

    void display(){
        System.out.println(enrollment);
        System.out.println(marks);
        System.out.println(name);
        System.out.println(gender);
        System.out.println();
        objectCount++;
    }
    public static void main(String[] args)
    {
       Student student1= new Student("Raghav","Male",151625,50);
       Student student2=new Student("Singh","Male",151620,70);
       Student student3=new Student("Pratap","Male",151640,90);
       student1.display();
       student2.display();
       student3.display();
       System.out.println();
        System.out.println("Count of Object: " + objectCount);
    }
}
