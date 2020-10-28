import MyPackage.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Mark_Exception {
        Scanner sc = new Scanner(System.in);
        StudentClass[] Student = new StudentClass[10];
        for (int i = 0; i < 10; i++) {
            Student[i] = new StudentClass();
            Student[i].GetName();
            try {
                Student[i].GetMarks();
            }
            catch(Mark_Exception e){
                System.out.println(e);
            }
            Student[i].calculate();
        }
        
        System.out.println("#######################################################################################################");
            System.out.print("---------------------------------------MARKSHEET---------------------------------------");
            for (int i=0; i<10; i++){
                Student[i].ShowStudentInfo();
            }
        sc.close();               
    }
}
