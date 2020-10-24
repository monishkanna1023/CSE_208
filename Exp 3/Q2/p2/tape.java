package p2;
import p1.*;

public class tape extends publication{
    float song_time;
    public void set_songtime(float t){
        song_time = t;
    }

    public void show_songtime(){
        System.out.println("Song time               :" + song_time);
        System.out.println("-----------------------------------------------------------------------");
    }
}
