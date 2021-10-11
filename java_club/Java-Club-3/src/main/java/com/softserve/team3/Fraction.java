package com.softserve.team3;

public class Fraction implements Comparable<Fraction> {
    private final long top;
    private final long bottom;

    public Fraction(long numerator, long denominator) {
        top = numerator;
        bottom = denominator;
    }

    @Override
    public int hashCode() {
        return 17 * Long.hashCode(top) + Long.hashCode(bottom);
    }

    @Override
    public boolean equals(Object o) {
        return compareTo((Fraction) o) == 0;
    }

    @Override
    public int compareTo(Fraction f2) {
        return Long.compare(top * f2.bottom, f2.top * bottom);
    }

    // Your work here!

    public long getTop() {
        return this.top;
    }

    public long getBottom() {
        return this.bottom;
    }

    private long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // Add two fractions
    public Fraction add(Fraction f2) {
        long newTop = getTop() * f2.getBottom() + getBottom() * f2.getTop();
        long newBottom = getBottom() * f2.getBottom();

        long fractionGcd = gcd(newTop, newBottom);
        return new Fraction(newTop / fractionGcd, newBottom / fractionGcd);
    }

    // ...and make this class string representable
    public String toString() {
        return getTop() + "/" + getBottom();
    }
}
