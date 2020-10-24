package p1;
 public class publication{
    String title;
    float price;

    public void set_title(String s){
        title = s;
    }

    public void set_price(float p){
        price = p;
    }

    public void show_info(){
        System.out.println("Title                   :" + title);
        System.out.println("Price                   :" + price);
    }
 }