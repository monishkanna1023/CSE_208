package p1;

public class one {
    public void sum(int[] x){
        int i;
        
        int sum=0;
        int length=x.length;

        for(i = 0; i<length; i++){
            if(x[i]%2!=0){
                sum=sum + x[i];
            }
        }
         System.out.println("The sum of the odd elements of the array is: " +sum);
         
    }
}
