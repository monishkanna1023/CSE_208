import p2.*;

public class Test {
    public static void main(String[] args){
        book mybook = new book();
        mybook.set_title("The Motivation Myth");
        mybook.set_price(5.99f);
        mybook.set_page_no(206);

        mybook.show_info();
        mybook.show_pgno();



        tape mytape = new tape();
        mytape.set_title("distance by ruel");
        mytape.set_price(2.99f);
        mytape.set_songtime(2.59f);

        mytape.show_info();
        mytape.show_songtime();
    }
}
