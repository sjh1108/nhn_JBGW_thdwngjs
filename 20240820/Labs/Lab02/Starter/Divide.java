import java.util.Scanner;

public class Divide {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 0, j = 0;

        try{
            System.out.println("Enter First Integer: ");
            String temp = sc.nextLine();
            i = Integer.parseInt(temp);

            System.out.println("Enter Second Integer");
            temp = sc.nextLine();
            j = Integer.parseInt(temp);
        } catch (NumberFormatException e){
            System.out.println("An Exception was thrown: " + e);
            sc.close();
            return;
        }
        sc.close();

        try{
            int k = i / j;

            System.out.printf("%d / %d = %d", i, j, k);

        } catch(ArithmeticException e){
            System.out.println(e + "\nYou can't divide by 0 ");
        }
    }
}