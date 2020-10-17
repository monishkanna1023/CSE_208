public class Exp2_Q1{
    public static void main(String[] args){
        Tape Song1= new Tape();
        Song1.get_title("London Calling");
        Song1.get_price(.99f);
        Song1.get_songtime(3.20f);
        Song1.show_info();     

        Book Book1= new Book();
        Book1.get_title("Beyond Good and Evil");
        Book1.get_price(9.99f);
        Book1.get_pg_no(212);
        Book1.show_info();

    }
}

class publication_company{
    String Title;
    float Price;
    void get_title(String title){
        Title = title;
    }
    void get_price(float price){
        Price = price;
    }

}

class Tape extends publication_company{
    float song_time;
    void get_songtime(float time){
        song_time = time;
    }
    

    void show_info(){
        System.out.println("Song Title     :"+ Title);
        System.out.println("Price          :"+ Price +"$");
        System.out.println("Song Playtime  :"+ song_time +" Minutes");
        System.out.println("-----------------------------------------------------------------------------------------------------");
    }
}

class Book extends publication_company{
    int pg_no;
    void get_pg_no(int pg){
        pg_no = pg;
    }
    void show_info(){
        System.out.println("Book Title     :"+ Title);
        System.out.println("Price          :"+ Price +"$");
        System.out.println("No. of pages   :"+ pg_no);
        System.out.println("-----------------------------------------------------------------------------------------------------");
    }

}