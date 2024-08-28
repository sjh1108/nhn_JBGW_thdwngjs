import java.util.Random;

public class Card {
    int n;
    int shape;
    private static boolean[][] isUsed;
    private static Random r;

    public Card(){
        if(isUsed == null){
            isUsed = new boolean[4][13];
        }
        if(r == null){
            r = new Random();
        }

        do{
            this.shape = r.nextInt(4);
            this.n = r.nextInt(13);
        }while(!checkUsed(this.shape, this.n));
    }

    private boolean checkUsed(int shape, int n){
        if(isUsed[shape][n]){
            return false;
        } else{
            return true;
        }
    }
}