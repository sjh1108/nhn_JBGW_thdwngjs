public class Example {
    public static void addOne(int i){
        i = i + 1;
    }

    public static void main(String[] args){
        long l = 9223372036854775807l;
        int i = (int) l;
        System.out.println(l);
        System.out.println(i);
        System.out.println(Long.toBinaryString(l));
        System.out.println(Long.toBinaryString(i));
    }
}
