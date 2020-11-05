class MultiplicationTable implements Runnable{
    String name;
    Thread t;
    int factor;
    MultiplicationTable(String ThreadName,int i){
        name=ThreadName;
        factor=i;
        t= new Thread(this, name);
    }

    public void run(){
        try{
            for(int i=1;i<10;i++){
                int product;
                product= i*factor;
                System.out.println(i+"*"+factor+"="+product);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println(name+" is interrupted");
        }
        System.out.println(name+" existing");
    }
    
}

class SumOfSeries implements Runnable{
    String name;
    Thread t;
    int number;
    SumOfSeries(String ThreadName, int n){
        name= ThreadName;
        t= new Thread(this,name);
        number=n;
    }

    public void run(){
        try{
            for(int i=1;i<number;i++){
                int sum=0;
                sum=sum+i;
                System.out.println("Sum of "+i+" natural numbers is "+sum);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println(name+" is interrupted");
        }
        System.out.println(name+" existing");
    }
}

class Factorial implements Runnable{
    String name;
    Thread t;
    int number;
    int product=1;
    Factorial(String ThreadName, int n){
        name= ThreadName;
        t= new Thread(this,name);
        number=n;
    }

    public void run(){
        try{
            for(int i=1;i<number;i++){
                product=i*product;
                System.out.println("Factorial of "+i+" is "+product);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println(name+" is interrupted");
        }
        System.out.println(name+" existing");
    }
}

class MultipleThreads {
    public static void main(String[] args){
        MultiplicationTable T1 = new MultiplicationTable("Multiplication Table",5);
        SumOfSeries T2 = new SumOfSeries("Sum of Natural Series",6);
        Factorial T3 = new Factorial("Factorial" ,5);

        T1.t.setPriority(Thread.MAX_PRIORITY);
        T2.t.setPriority(Thread.MIN_PRIORITY);
        T2.t.setPriority(Thread.NORM_PRIORITY);

        System.out.println("The priority of the Multiplication Table is: "+ T1.t.getPriority());
        System.out.println("The priority of the Sum of series is: "+ T2.t.getPriority());
        System.out.println("The priority of the Factorial is: "+ T3.t.getPriority());

        T1.t.start();
        T2.t.suspend();
        T3.t.start();
        T2.t.resume();

        System.out.println("is multiplication table is alive? "+T1.t.isAlive());
        System.out.println("is Sum of series is alive? "+T2.t.isAlive());
        System.out.println("is Factorial is alive? "+T3.t.isAlive());


        try{
            System.out.println("Waiting for threads to finish");
            T1.t.join();
            T2.t.join();
            T3.t.join();
        }catch (InterruptedException e){
            System.out.println("Main thread Interrupted");
        }
        System.out.println("is multiplication table is alive? "+T1.t.isAlive());
        System.out.println("is Sum of series is alive? "+T2.t.isAlive());
        System.out.println("is Factorial is alive? "+T3.t.isAlive());
        
    }
}