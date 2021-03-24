interface Exam {
    
    public boolean Pass(int marks);
    
}

interface Classify{
    
   public String Division(int average);
}

class Result implements Exam, Classify{

    public boolean Pass(int marks){
 
        if (marks>=50) {
            return true;
        }
        else{
            return false;
        }
    }


    public String Division(int average){
        if (average>=60) {
            return "First";
        }
        else if(average >=50 && average<60){
            return "Second";
        }
        else {
            return "No Division";
        }

    }


    public static void main(String[] args) {
        Exam obj = new Result();
        System.out.println(obj.Pass(60));
        Classify obj2= new Result();
        System.out.println(obj2.Division(49));
        
        
    }
}
