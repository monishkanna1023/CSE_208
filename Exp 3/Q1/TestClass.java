import pkg.*;

class TestClass implements inter1, inter2{
    public void max(int[] a){
        int i;
        int MaxVal = a[0];
        for(i=1; i<a.length; i++){
            if(a[i]>MaxVal){
                MaxVal = a[i];
            }
        }
        System.out.println("The maximum value is: " + MaxVal);
    }


    public static void main(String[] args){
        TestClass myobject = new TestClass();
        myobject.max(IntArray);
        
    }
}

