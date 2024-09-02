import java.util.Scanner;

public class JBGW_027_Poker {
    public static int playerNumber;
    public static String playerName;
    public static Player[] players;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of players: ");
        
        while(true){
            try{
                playerNumber = sc.nextInt();

                if(playerNumber < 2 || playerNumber > 5){
                    System.out.println("Please enter a number between 2 and 5.");
                    continue;
                }
                break;
            } catch(Exception e){
                System.out.println("Please enter a valid number.");
                sc.nextLine();
                continue;
            }
        }

        System.out.println("Enter Your Name: ");
        playerName = sc.next();
        sc.close();
    }
}
