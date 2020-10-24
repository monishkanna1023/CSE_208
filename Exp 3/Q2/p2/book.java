package p2;
import p1.*;

public class book extends publication {
    int page_no;
    public void set_page_no(int pgno){
        page_no = pgno;
    }

    public void show_pgno(){
        System.out.println("Page no is              :" + page_no);
        System.out.println("-----------------------------------------------------------------------");
    }
}
