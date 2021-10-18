package urban_andrii;

public class Task14 {
        private int numerator;
        private int denominator;

        public Task14(int numerator, int denominator, boolean wantToReduce) {

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

        public Task14(int num) {
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
            if(!(obj instanceof urban_andrii.Task14)) return false;
            urban_andrii.Task14 f = ((urban_andrii.Task14)obj);
            int gcd = getGCD(numerator, denominator);
            f.reduce();
            if(this.numerator / gcd == f.numerator && this.denominator / gcd == f.denominator) return true;
            else return false;
        }

        private int getGCD(int numerator, int denominator) {
            if(denominator == 0) return numerator;
            return getGCD(denominator, numerator % denominator);
        }

        public urban_andrii.Task14 reduce() {
            int gcd = getGCD(numerator,denominator);
            numerator /= gcd;
            denominator /= gcd;
            return this;
        }

        public static urban_andrii.Task14 add(urban_andrii.Task14 f1, urban_andrii.Task14 f2, boolean w) {
            return new urban_andrii.Task14(f1.numerator * f2.denominator + f2.numerator * f1.denominator, f1.denominator * f2.denominator, w);
        }

        public static urban_andrii.Task14 sub(urban_andrii.Task14 f1, urban_andrii.Task14 f2, boolean w) {
            return new urban_andrii.Task14(f1.numerator*f2.denominator - f2.numerator*f1.denominator, f1.denominator * f2.denominator, w);
        }

        public static urban_andrii.Task14 mul(urban_andrii.Task14 f1, urban_andrii.Task14 f2, boolean w) {
            return new urban_andrii.Task14(f1.numerator * f2.numerator, f1.denominator * f2.denominator, w);
        }

        public static urban_andrii.Task14 div(urban_andrii.Task14 f1, urban_andrii.Task14 f2, boolean w) {
            return new urban_andrii.Task14(f1.numerator*f2.denominator, f1.denominator*f2.numerator, w);
        }


}
