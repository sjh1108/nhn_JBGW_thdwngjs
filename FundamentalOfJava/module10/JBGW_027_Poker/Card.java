public class Card implements Comparable<Card>{
    private final int no;
    private final String suit;
    private final String displayNo;

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

    @Override
    public String toString(){
        return this.displayNo + " of " + this.suit;
    }

    @Override
    public int compareTo(Card card){
        if(this.no > card.getNo()){
            return 1;
        } else if(this.no == card.getNo()){
            return 0;
        } else{
            return -1;
        }
    }
}