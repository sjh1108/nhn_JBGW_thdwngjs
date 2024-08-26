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

    public Rational addRational(Rational left, Rational right){
        int leftN = left.getNumerator();
        int leftD = left.getDenominator();

        int rightN = right.getNumerator();
        int rightD = right.getDenominator();

        int numerator = (leftN * rightD) + (leftD * rightN);
        int denominator = leftD * rightD;

        int gCD = gCD(numerator, denominator);
        Rational tmp = new Rational(numerator/gCD, denominator/gCD);

        return tmp;
    }

    public Rational subRational(Rational left, Rational right){
        int leftN = left.getNumerator();
        int leftD = left.getDenominator();

        int rightN = right.getNumerator();
        int rightD = right.getDenominator();

        int numerator = (leftN * rightD) - (leftD * rightN);
        int denominator = leftD * rightD;

        int gCD = gCD(numerator, denominator);
        Rational tmp = new Rational(numerator/gCD, denominator/gCD);

        return tmp;
    }

    public Rational mulRational(Rational left, Rational right){
        int leftN = left.getNumerator();
        int leftD = left.getDenominator();

        int rightN = right.getNumerator();
        int rightD = right.getDenominator();

        int numerator = leftN * rightN;
        int denominator = leftD * rightD;

        int gCD = gCD(numerator, denominator);
        Rational tmp = new Rational(numerator/gCD, denominator/gCD);

        return tmp;
    }

    public Rational divRational(Rational left, Rational right){
        if(right.getNumerator() == 0){
            throw new ArithmeticException("You can't divide by 0");
        }
        return mulRational(left, new Rational(right.getDenominator(), right.getNumerator()));
    }

    public int getNumerator(){
        return this.numerator;
    }
    public int getDenominator(){
        return this.denominator;
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }
    public void setDenominator(int denominator){
        this.denominator = denominator;
    }

    private int gCD(int m, int n){
        return (n == 0) ? m : gCD(n, m % n);
    }

    public String toString(){
        return this.numerator + "/" + this.denominator;
    }
}