import java.util.Scanner;

public class Hello {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    }
}

class Test{
    public static void main(String[] args){
        if(args[0].equals("a")){
            return;
        }
        System.out.println("Hello, Test");
    }
}