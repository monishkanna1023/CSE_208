package MyPackage;

public class Mark_Exception extends Exception {

    private static final long serialVersionUID = 1L;
    private int mark;
    Mark_Exception(int m){
        mark=m;
    }

    public String toString(){
        return "Mark_Exception. "+mark+ " is invalid. Mark should lie between 0 and 100";
    }
}
