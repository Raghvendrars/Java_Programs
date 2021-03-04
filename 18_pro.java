class Vehicle{

    String vehicleType="Sedan";
    void display(){
        System.out.println(vehicleType);
    }
}

class car extends Vehicle {
    String model_type="Xuv 500";
    String company_name="Mahindra";

    void display(){
        super.display();
        System.out.println(model_type);
        System.out.println(company_name);
    }
        
    public static void main(String[] args){
        car c = new car();
        c.display();
    }
}

