import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;

public class HandRank {
    /*
     * 1. Straight Flush
     * 2. Four of a Kind
     * 3. Full House
     * 4. Flush
     * 5. Straight
     * 6. Three of a Kind
     * 7. Two Pair
     * 8. One Pair
     * 9. High Card
     */
    private static List<String> suits;

    private List<Card> hand;
    private HashMap<Integer, Integer> noCount;
    private Rank handRank;

    public HandRank(List<Card> hand){
        if(suits == null){
            suits = new LinkedList<>();
            suits.add("Spade");
            suits.add("Diamond");
            suits.add("Heart");
            suits.add("Club");
        }

        this.hand = hand;
        getNoCount();
        getRank();
    }

    public Rank getHandRank(){
        if(this.handRank == null){
            this.handRank = getRank();
        }
        return this.handRank;
    }

    public Rank getRank(){
        Rank rank;

        boolean isFourOfAKind = isFourOfAKind();
        boolean isFlush = isFlush();
        boolean isStraight = isStraight();
        boolean isTriple = isTriple();
        boolean isTwoPair = isTwoPair();
        boolean isPair = isPair();

        if(isFlush && isStraight){
            rank = Rank.StraightFlush;
        }
        else if(isFourOfAKind){
            rank = Rank.FourOfAKind;
        }
        else if(isFlush){
            rank = Rank.Flush;
        }
        else if(isTriple && isPair){
            rank = Rank.FullHouse;
        }
        else if(isStraight){
            rank = Rank.Straight;
        }
        else if(isTriple){
            rank = Rank.ThreeOfAKind;
        }
        else if(isTwoPair){
            rank = Rank.TwoPair;
        }
        else if(isPair){
            rank = Rank.OnePair;
        }
        else{
            rank = Rank.HighCard;
        }

        return rank;
    }

    private void getNoCount(){
        if(noCount == null){
            noCount = new HashMap<>();
        }
        
        for(Card card : this.hand){
            int no = card.getNo();

            if(noCount.containsKey(no)){
                noCount.put(no, noCount.get(no) + 1);
            } else{
                noCount.put(no, 1);
            }
        }
    }

    private boolean isFourOfAKind(){
        if(noCount == null){
            getNoCount();
        }

        for(int no : noCount.keySet()){
            if(noCount.get(no) == 4){
                return true;
            }
        }

        return false;
    }

    private boolean isFlush(){
        HashMap<String, Integer> suitCount = new HashMap<>();

        for(Card card : hand){
            String suit = card.getSuit();

            if(suitCount.containsKey(suit)){
                suitCount.put(suit, suitCount.get(suit) + 1);
            } else{
                suitCount.put(suit, 1);
            }

        }

        for(String suit : suits){
            if(suitCount.get(suit) == 5){
                return true;
            }
        }

        return false;
    }

    private boolean isStraight(){
        int[] numbers = new int[5];
        for(int i = 0; i < 5; i++){
            numbers[i] = this.hand.get(i).getNo();
        }

        boolean flag = false;
        for(int i = 1; i < 5; i++){
            if(numbers[i] == numbers[i - 1] + 1){
                flag = true;
            } else{
                flag = false;
                break;
            }
        }
        
        if(!flag && numbers[0] == 1 && numbers[1] == 10 && numbers[2] == 11 && numbers[3] == 12 && numbers[4] == 13){
            flag = true;
        }
        
        return false;
    }

    private boolean isTriple(){
        if(noCount == null){
            getNoCount();
        }

        for(int no : noCount.keySet()){
            if(noCount.get(no) == 3){
                return true;
            }
        }

        return false;
    }

    private boolean isTwoPair(){
        if(noCount == null){
            getNoCount();
        }

        int pairCount = 0;
        for(int no : noCount.keySet()){
            if(noCount.get(no) == 2){
                pairCount++;
            }
        }

        return pairCount == 2;
    }

    private boolean isPair(){
        if(noCount == null){
            getNoCount();
        }

        for(int no : noCount.keySet()){
            if(noCount.get(no) == 2){
                return true;
            }
        }

        return false;
    }
}
