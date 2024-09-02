import java.util.List;
import java.util.LinkedList;

public class Test {
    public static int playerNumber = 2;
    public static List<Player> players;
    public static void main(String[] args){
        Deck.init();

        players = new LinkedList<>();
        for(int i = 0; i < playerNumber; i++){
            players.add(new Player("Player " + (i + 1)));
        }

        for(Player player : players){
            System.out.println(player);
        }
    }
}
