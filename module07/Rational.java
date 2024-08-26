public class Rational{
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator){
        if(denominator == 0){
            throw new ArithmeticException("denominator can't be 0");
        }

        int gCD = this.gCD(numerator, denominator);

        this.numerator = numerator / gCD;
        this.denominator = denominator / gCD;
    }

    private int gCD(int m, int n){
        return (n == 0) ? m : gCD(n, m % n);
    }

    public String toString(){
        return this.numerator + "/" + this.denominator;
    }
}