import java.util.Scanner;

public class Algorithm {

    public static boolean anagram(String a, String b){
        if(a.length() != b.length()) return false;

        char[] arr = a.toCharArray();
        char[] brr = b.toCharArray();

        boolean flag = false;
        do{
            flag = false;
            for(int i = 0; i < arr.length-1; i++){
                char c = arr[i];
                char v = arr[i+1];

                if(c > v){
                    char tmp = 0;
                    c = v;
                    v = tmp;

                    flag = true;
                }
            }

            for(int i = 0; i < arr.length-1; i++){
                char c = brr[i];
                char v = brr[i+1];

                if(c > v){
                    char tmp = 0;
                    c = v;
                    v = tmp;

                    flag = true;
                }
            }
        } while(flag);

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != brr[i]) return false;
        }

        return true;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(anagram(sc.nextLine(), sc.nextLine()));

        sc.close();
    }
}
