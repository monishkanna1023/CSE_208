public class Laptop{
    String ModelNumber, ManufactureName,Color;
    int Cost, MemoryCapacity_RAM, MemoryCapacity_HDD,CameraResolution;
    float ScreenSize,ProcessorSpeed;
    public Laptop(){
        ModelNumber ="AA0000";
        ManufactureName ="Generic";
        Cost= 0;
        Color="black";
        MemoryCapacity_RAM=4;
        MemoryCapacity_HDD=512;
        CameraResolution=720;
        ScreenSize=13f;
        ProcessorSpeed=2.4f;
    }

    public Laptop(String MNo, int Cst){
        ModelNumber=MNo;
        Cost=Cst;
    }
    public Laptop(String brand, String colour, float Ssize){
        ManufactureName= brand;
        Color=colour;
        ScreenSize=Ssize;
    }
    public Laptop(float clock, int RAM, int HDD, int WebCam){
        ProcessorSpeed=clock;
        MemoryCapacity_RAM=RAM;
        MemoryCapacity_HDD=HDD;
        CameraResolution=WebCam;
    }
    void display(){
        System.out.println("The model Number of the laptop is "+ ModelNumber);
        System.out.println("The Cost of the laptop is "+ Cost+" INR");
        System.out.println("The laptop is manufactured by "+ ManufactureName);
        System.out.println("The laptop color is "+ Color);
        System.out.println("The Laptop is "+ ScreenSize +" inches diagonally");
        System.out.println("The processor is clocked at "+ ProcessorSpeed+" GHz");
        System.out.println("The laptop has "+MemoryCapacity_RAM+"GB of RAM");
        System.out.println("The laptop has "+MemoryCapacity_HDD+"GB of Storage");
        System.out.println("The Web Cam resolution is "+CameraResolution+"p");
        System.out.println("//-------------------------------------------------------------------------------------------------------------------------//");
    }
    public static void main(String[] args) {
        Laptop lap1=new Laptop();
        lap1.display();
        Laptop lap2=new Laptop("FX505DT",60000);
        lap2.display(); 
        Laptop lap3=new Laptop("ASUS", "Black", 15.6f);
        lap3.display();
        Laptop lap4=new Laptop(3.7f,8,512,720);
        lap4.display();    
    }
}
