public class Q2 {
    public static void main(String[] args) {
        BG_score mine = new BG_score();
        mine.favorite_score();
        mine.favorite_song();
    }
    
}

class Music{
    void favorite_song(){
        System.out.println("My current favorite dong is Marilyn Monroe by Pharell Williams.");
    }
}

class BG_score extends Music {
    void favorite_score(){
        System.out.println("My current favorite score is FOREVER by Labrinth");
    }
}