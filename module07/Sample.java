public class Sample{
    public static void main(String[] args){}
}

class RactionalOperaters{
    public static int[] plus(int[] left, int[] right){
        int numerator = left[0] * right[1] + left[1]* right[0];
        int demoninator = left[1] * right[1];

        int g = gCD(numerator, demoninator);

        return new int[] {numerator/g, demoninator/g};
    }

    public static int[] minus(int[] left, int[] right){
        int numerator = left[0] * right[1] - left[1]* right[0];
        int demoninator = left[1] * right[1];

        int g = gCD(numerator, demoninator);

        return new int[] {numerator/g, demoninator/g};
    }

    public static int[] multiply(int[] left, int[] right){
        int numerator = left[0] * right[0];
        int demoninator = left[1] * right[1];

        int g = gCD(numerator, demoninator);

        return new int[] {numerator/g, demoninator/g};
    }

    public static int[] divide(int[] left, int[] right){
        return multiply(left, new int[] {right[1], right[1]});
    }

    static int gCD(int a, int b){
        if(b == 0) return a;
        return gCD(b, a%b);
    }
}