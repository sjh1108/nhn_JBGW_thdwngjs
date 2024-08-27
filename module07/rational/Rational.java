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

    public Rational add(Rational r){
        int numerator, denominator;

        numerator = (this.numerator * r.getDenominator()) + (this.denominator * r.getNumerator());
        denominator = this.denominator * r.getDenominator();
        
        int gCD = gCD(numerator, denominator);
        return new Rational(numerator/gCD, denominator/gCD);
    }

    public Rational subtract(Rational r){
        int numerator, denominator;

        numerator = (this.numerator * r.getDenominator()) - (this.denominator * r.getNumerator());
        denominator = this.denominator * r.getDenominator();

        int gCD = gCD(numerator, denominator);
        return new Rational(numerator/gCD, denominator/gCD);
    }

    public Rational times(Rational r){
        int numerator, denominator;

        numerator = this.numerator * r.getNumerator();
        denominator = this.denominator * r.getDenominator();

        int gCD = gCD(numerator, denominator);
        return new Rational(numerator/gCD, denominator/gCD);
    }

    public Rational divide(Rational r){
        if(r.getNumerator() == 0){
            throw new ArithmeticException("You can't divide by 0");
        }
        return times(r.reciprocal());
    }

    public Rational reciprocal(){
        return new Rational(this.denominator, this.numerator);
    }

    public int getNumerator(){
        return this.numerator;
    }
    public int getDenominator(){
        return this.denominator;
    }

    public void set(int numerator, int denominator){
        setNumerator(numerator);
        setDenominator(denominator);
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
        if(this.denominator == 1){
            return this.numerator + "";
        }
        return this.numerator + "/" + this.denominator;
    }
}