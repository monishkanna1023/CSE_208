public class Q3 {
    public static void main(String[] args) {
        Watch_it Now = new Watch_it();
        Now.TV_Show();
    }
    
}

abstract class bored{
    abstract void TV_Show();
}

class Watch_it extends bored{
    void TV_Show(){
        System.out.println("Just binge The Simpsons!!!!");
    }    
}