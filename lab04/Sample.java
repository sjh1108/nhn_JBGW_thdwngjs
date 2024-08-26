import java.util.Scanner;
public class Sample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter year number: ");
            int i = Integer.parseInt(args[0]);
        } catch(ArithmeticException e){
        } finally{
            sc.close();
        }
    }
}
