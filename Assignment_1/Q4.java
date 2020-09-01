public class Q4 {
    public static void main(String[] args){
        Boredd Now = new Boredd();
        Now.TV_Shows();
        Now.TV_ShowsAgain();
    }    
}

interface Drive_away_boredom{
    public void TV_Shows();
    public void TV_ShowsAgain();
}

class Boredd implements Drive_away_boredom{
    public void TV_Shows(){
        System.out.println("Watch: What we do in the shadows!!!");
    }

    public void TV_ShowsAgain(){
        System.out.println("You again? fine. Go watch: The Mandalorian!!!!!");
    }
}