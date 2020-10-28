import Myclass.*;

public class Main {
    public static void main(String[] args){
        Employee_class emp1 = new Employee_class();
        Employee_class emp2 = new Employee_class();
        try{
            emp1.Add_Employee_info("EMP069", "Christian Gray", 26);
        }
        catch(Age_Exception e){
            System.out.println(e);
        }
        emp1.Show_EmployeeInfo();

        try{
            emp2.Add_Employee_info("EMP420", "Pinocchio", 10);
        }
        catch(Age_Exception e){
            System.out.println(e);
        }


        emp2.Show_EmployeeInfo();
    }
}