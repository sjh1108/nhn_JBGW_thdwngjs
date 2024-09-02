import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

public class Deck {
    public static List<Card> deck;

    private Deck(){
        deck = new LinkedList<>();

        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        String[] suits = {"Heart", "Diamond", "Club", "Spade"};
        String[] displayNos = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for(int i = 0; i < 52; i++){
            deck.add(new Card(numbers[i % 13], suits[i / 13], displayNos[i % 13]));
        }

        Collections.shuffle(deck);
    }

    public static void init(){
        if(deck == null){
            new Deck();
        }
        else if(deck.size() != 52){
            deck.clear();
            new Deck();
        }
    }

    public static List<Card> draw(){
        LinkedList<Card> cards = new LinkedList<>();

        for(int i = 0; i < 5; i++){
            cards.add(deck.remove(0));
        }

        return cards;
    }
}
