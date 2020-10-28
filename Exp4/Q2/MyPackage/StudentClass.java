package MyPackage;

import java.util.*;

public class StudentClass{
    String name;
    int math, phy, chem, bio, eng, ger;
    float percentage;
    int total;
    Scanner sc = new Scanner(System.in);
    public void GetName(){
        System.out.print("Please enter student name: ");
        name = sc.nextLine();
    }

    public void GetMarks() throws Mark_Exception{
        System.out.print("Please enter math mark           : ");
        int temp1=sc.nextInt();
        if(temp1>100 || temp1<0){
            throw new Mark_Exception(temp1);
        }
        else{
            math=temp1;
        }
        System.out.print("Please enter physics mark        : ");
        int temp2=sc.nextInt();
        if(temp2>100 || temp2<0){
            throw new Mark_Exception(temp2);
        }
        else{
            phy=temp2;
        }
        System.out.print("Please enter chemistry mark      : ");
        int temp3=sc.nextInt();
        if(temp3>100 || temp3<0){
            throw new Mark_Exception(temp3);
        }
        else{
            chem=temp3;
        }
        System.out.print("Please enter biology mark        : ");
        int temp4=sc.nextInt();
        if(temp4>100 || temp4<0){
            throw new Mark_Exception(temp4);
        }
        else{
            bio=temp4;
        }
        System.out.print("Please enter english mark        : ");
        int temp5=sc.nextInt();
        if(temp5>100 || temp5<0){
            throw new Mark_Exception(temp5);
        }
        else{
            eng=temp5;
        }
        System.out.print("Please enter german mark         : ");
        int temp6=sc.nextInt();
        if(temp6>100 || temp6<0){
            throw new Mark_Exception(temp6);
        }
        else{
            ger=temp6;
        }
        
    }

    public void calculate(){
        total= eng+ger+bio+chem+phy+math;
        percentage = total*100/600;
    }

    public void ShowStudentInfo(){
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("STUDENT NAME                  : "+name);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Math mark                     : "+math);
        System.out.println("Physics mark                  : "+phy);
        System.out.println("Chemistry mark                : "+chem);
        System.out.println("Biology mark                  : "+bio);
        System.out.println("English mark                  : "+eng);
        System.out.println("German Mark                   : "+ger);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("TOTAL MARKS                   : "+total);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Percentage                    : "+percentage+"%");
        System.out.println("----------------------------------------------------------------------------");
    }
}

