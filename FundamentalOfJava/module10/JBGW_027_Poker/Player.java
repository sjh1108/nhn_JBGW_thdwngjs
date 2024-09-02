import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

public class Player {
    public final String name;
    private List<Card> hand;
    private HandRank handRank;

    public Player(String name){
        this.name = name;
        this.hand = new LinkedList<>();
        drawCards();

        handRank = new HandRank(this.hand);
        handRank.getHandRank();
    }

    public void drawCards(){
        this.hand.addAll(Deck.draw());

        Collections.sort(this.hand);
    }

    public List<Card> getHand(){
        return this.hand;
    }

    public void clearHand(){
        this.hand.clear();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(":\n");

        for(Card card : this.hand){
            sb.append(card).append(", ");
        }

        return sb.toString();
    }
}
