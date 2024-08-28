import java.util.Scanner;

public class Utilities {
    public static int max(int i, int j) {
        if (i > j)
            return i;
        else
            return j;
    }
    public static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }
}

class Test {
    public static void main(String[] args) {
        int i = 1, j = 2;
        System.out.printf("swap 메소드 호출 전 i: %d, j: %d\n", i, j);
        Utilities.swap(i, j);
        System.out.printf("swap 메소드 호출 후 i: %d, j: %d", i, j);
    }
}