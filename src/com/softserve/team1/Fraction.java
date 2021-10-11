public final class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator, boolean wantToReduce) {
        if(denominator == 0) throw new IllegalArgumentException("The denominator is zero.");
        if(numerator == 0) {
            this.numerator = 0;
            this.denominator = 1;
        }
        else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
        if(denominator < 0) {
            this.numerator = -this.numerator;
            this.denominator = -this.denominator;
        }
        if(wantToReduce) this.reduce();
    }

    public Fraction(int num) {
        this.numerator = num;
        this.denominator = 1;
    }

    @Override
    public String toString() {
        if(denominator != 1)
            return numerator + "/" + denominator;
        else
            return numerator + "";
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Fraction)) return false;
        Fraction f = ((Fraction)obj);
        int gcd = getGCD(numerator, denominator);
        f.reduce();
        if(this.numerator / gcd == f.numerator && this.denominator / gcd == f.denominator) return true;
        else return false;
    }

    private int getGCD(int numerator, int denominator) {
        if(denominator == 0) return numerator;
        return getGCD(denominator, numerator % denominator);
    }

    public Fraction reduce() {
        int gcd = getGCD(numerator,denominator);
        numerator /= gcd;
        denominator /= gcd;
        return this;
    }

    public static Fraction add(Fraction f1, Fraction f2, boolean w) {
        return new Fraction(f1.numerator * f2.denominator + f2.numerator * f1.denominator, f1.denominator * f2.denominator, w);
    }

    public static Fraction sub(Fraction f1, Fraction f2, boolean w) {
        return new Fraction(f1.numerator*f2.denominator - f2.numerator*f1.denominator, f1.denominator * f2.denominator, w);
    }

    public static Fraction mul(Fraction f1, Fraction f2, boolean w) {
        return new Fraction(f1.numerator * f2.numerator, f1.denominator * f2.denominator, w);
    }

    public static Fraction div(Fraction f1, Fraction f2, boolean w) {
        return new Fraction(f1.numerator*f2.denominator, f1.denominator*f2.numerator, w);
    }

}

class Example {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,4,true);
        Fraction f2 = new Fraction(5,7,true);

        Fraction summa = Fraction.add(f1,f2, true);
        Fraction subtract = Fraction.sub(f1,f2,true);
        Fraction mult = Fraction.mul(f1,f2,true);
        Fraction div = Fraction.div(f1,f2,true);

        System.out.println(f1 + " + " + f2 + " = " + summa);
        System.out.println(f1 + " - " + f2 + " = " + subtract);
        System.out.println(f1 + " * " + f2 + " = " + mult);
        System.out.println(f1 + " : " + f2 + " = " + div);
    }
}