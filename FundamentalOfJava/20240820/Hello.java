import java.util.Scanner;

/**
 * @author songjuheon
 * @version 1.0 2024-08-20
 */
public class Hello{
    /**
     * @param args 프로그램이 실행될 때 주어지는 인자값이 포함된 배열입니다
     */
    public static void main(String[] args){
        try{
            int i = 0, j = 0;
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            i = Integer.parseInt(line);
            line = sc.nextLine();
            j = Integer.parseInt(line);

            System.out.println(i + j);

            sc.close();
        } catch(Exception e){
            System.out.println("Got a Error");
        }
    }
}