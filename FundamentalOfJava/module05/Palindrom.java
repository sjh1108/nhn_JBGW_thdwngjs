public class Palindrom {

    public static boolean isPalindrom(int value){
        int reverseNum = 0;
        int reminder;
        int originalNum = value;

        while(value != 0){
            reminder = value % 10;
            reverseNum = reverseNum * 10 + reminder;
            value /= 10;
        }

        return reverseNum == originalNum;
    }

    public static void main(String[] args){
        System.out.println(isPalindrom(23));
    }
}
