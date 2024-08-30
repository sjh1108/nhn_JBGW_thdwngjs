public class Card {
    private int no;
    private String suit;
    private String displayNo;

    public Card(int no, String suit, String displayNo){
        this.no = no;
        this.suit = suit;
        this.displayNo = displayNo;
    }

    public int getNo(){
        return this.no;
    }
    public String getSuit(){
        return this.suit;
    }
    public String getDisplayNo(){
        return this.displayNo;
    }
}