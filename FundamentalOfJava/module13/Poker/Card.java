import java.util.Scanner;

public class Card <T>{
    private int no;
    private String suit;
    private String displayNo;

    T[] array;

    @SuppressWarnings("unchecked")
    public Card(int no, String suit, String displayNo){
        array = (T[]) new Object[5];
    }

    @Override
    @SuppressWarnings("resource")
    public String toString(){
        Scanner scanner = new Scanner(System.in);
        return this.displayNo + ", " + this.suit;
    }
}