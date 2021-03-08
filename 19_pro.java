class Account {
    String account_num="37392266277";
    int balance=100000;
}

class Savings extends Account{

    float interestRate=11;
    
}

class Current extends Account{

    int depositthis=50000;
    
    int withdrawthis=30000;
    int overdraftLimit=100000;
    int afterdeposite;
    int afterwithdraw;
    float totalinterest=(balance*11)/100;

    
}

class banking extends Current{

   void interestCalc(){
    float afterint=balance+totalinterest;
    System.out.println("Your balance after one month: "+afterint);
   } 

    void deposite(){
        afterdeposite=balance+depositthis;
         System.out.println("Your balance after  deposite of 50000: "+afterdeposite);
     }
 
     void withdraw(){
        afterwithdraw=afterdeposite-withdrawthis;
         System.out.println("Your balance after  withdraw of 30000: "+afterwithdraw);
     }
 
     void checkbalance(){
         System.out.println("Your Account Balance is: "+balance);
     }
}


class mainfun{

    public static void main(String[] args) {

        banking obj1 = new banking();
        obj1.checkbalance();
        obj1.interestCalc();
        obj1.deposite();
        obj1.withdraw();
        

    }


}
