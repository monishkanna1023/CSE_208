public class Exp2_Q2{
    public static void main(String[] args){
        Savings_Account Account1= new Savings_Account();
        Account1.set_AccID(12191023);
        Account1.set_CustID("AXIS10231028");
        Account1.set_bal(69420);
        Account1.deposit(12191023, 69420);
        Account1.show_bal();
        Account1.withdraw(12191023, 69420);
        Account1.show_bal();
    }
}

abstract class Accounts{
    int Account_ID;
    String Customer_ID;
    int bal;
    void set_bal(int balance){
        bal=balance;
    }
    void set_AccID(int ACCID){
        Account_ID=ACCID;
    }
    void set_CustID(String CUSTID){
        Customer_ID=CUSTID;
    }
    void show_bal(){
        System.out.println("The balance is          :"+bal +" Rupees only");
        System.out.println("-------------------------------------------------------------------------------------");
    }
    abstract void deposit(int Acc_ID, int depositAMOUNT);
    abstract void withdraw(int Acc_ID, int withdrawAMOUNT);
}

class Savings_Account extends Accounts{
    void deposit(int Acc_ID, int depositAMOUNT) {
        if (Acc_ID == Account_ID){
            bal= bal+depositAMOUNT;
            System.out.println("Amount deposited        :"+ depositAMOUNT);
        }
        else{
            System.out.println("Accout does not exist. Try again with a valid account.");
        }
    }
    void withdraw(int Acc_ID, int withdrawAMOUNT){
        if(Acc_ID == Account_ID && withdrawAMOUNT<=bal){
            bal=bal-withdrawAMOUNT;
            System.out.println("Amount withdrawn        :"+ withdrawAMOUNT);
        }
        else if(Acc_ID != Account_ID){
            System.out.println("Accout does not exist. Try again with a valid account.");
        }
        else if (withdrawAMOUNT > bal){
            System.out.println("Insuffient balance!");
        }
    }
}