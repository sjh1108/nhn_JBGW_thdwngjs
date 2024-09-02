public class Rational {
    private int a, b;

    public Rational(){
        this(0, 1);
    }

    public Rational(Rational r){
        this(r.getNumerator(), r.getDenominator());
    }

    public Rational(int a, int b){
        set(a, b);
    }

    public void set(int a, int b){
        int gcd = gCD(a, b);

        this.a = a / gcd;
        this.b = b / gcd;
    }

    public void setNumerator(int a){
        this.a = a;
    }
    public void setDenominator(int b){
        this.b = b;
    }

    public int getNumerator(){
        return this.a;
    }

    public int getDenominator(){
        return this.b;
    }

    public Rational add(int x){
        return new Rational(x, 1);
    }
    public Rational add(Rational r){
        int numerator = this.a * r.getDenominator() + r.getNumerator() * this.b;
        int denominator = this.b * r.getDenominator();

        return new Rational(numerator, denominator);
    }

    public Rational subtract(int x){
        return subtract(new Rational(x, 1));
    }
    public Rational subtract(Rational r){
        int numerator = this.a * r.getDenominator() - r.getNumerator() * this.b;
        int denominator = this.b * r.getDenominator();

        return new Rational(numerator, denominator);
    }

    public Rational times(int x){
        return new Rational(x, 1);
    }
    public Rational times(Rational r){
        int numerator = this.a * r.getNumerator();
        int denominator = this.b * r.getDenominator();

        return new Rational(numerator, denominator);
    }

    public Rational divide(int x){
        return divide(new Rational(x, 1));
    }
    public Rational divide(Rational r){
        return this.times(r.reciprocal());
    }

    private Rational reciprocal(){
        return new Rational(this.b, this.a);
    }

    public int gCD(int a, int b){
        if(b == 0) return a;
        return gCD(b, a%b);
    }
}
