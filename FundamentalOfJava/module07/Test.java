public class Test {
    public static void main(String[] args){
        Rational r1 = new Rational(1, 2);
        System.out.println(r1);
        Rational r2 = new Rational(1, 2);
        System.out.println(r2);

        System.out.println("add: " + r1.add(r2));
        System.out.println("sub: " + r1.subtract(r2));
        System.out.println(r1);
        System.out.println("mul: " + r1.times(r2));
    }
}
