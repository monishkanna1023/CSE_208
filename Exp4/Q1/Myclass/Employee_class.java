package Myclass;

public class Employee_class {
    String Emp_ID;
    String Emp_Name;
    int Emp_Age;
    public void Add_Employee_info(String ID, String Name, int Age) throws Age_Exception{
        System.out.println("Checking Age");
        Emp_ID=ID;
        Emp_Name=Name;
        if(Age<18){
            throw new Age_Exception(Age);
        }
        else{
            Emp_Age=Age;
            System.out.println("Valid Age!");
        }
    }

    public void Show_EmployeeInfo(){
        System.out.println("Employee ID           :"+ Emp_ID);
        System.out.println("Employee Name         :"+ Emp_Name);
        System.out.println("Employee Age          :"+ Emp_Age);
        System.out.println("------------------------------------------------------------------------------");
    }
}

