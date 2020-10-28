package Myclass;

public class Age_Exception extends Exception {
    private static final long serialVersionUID = 1L;
    private int age;
    Age_Exception(int a){
        age=a;
    }

    public String toString(){
        return "Age exception caught: " +age+ " is an invalid age :(";
    }
}