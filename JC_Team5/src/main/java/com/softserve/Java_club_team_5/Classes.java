package com.softserve.Java_club_team_5;

import Tasks1_1.Classes.Kata13;
import Tasks1_1.Classes.Kata14;

public class Classes {
    //kata1
    public class EncapsulationDemo{
        private int number;
        private String stringValue;
        private Object anObject;

        public int getNumber(){return number;}
        public String getStringValue(){return stringValue;}
        public Object getAnObject(){return anObject;}

        public void setNumber(int number){this.number = number;}
        public void setStringValue(String stringValue){this.stringValue = stringValue;}
        public void setAnObject(Object anObject){this.anObject = anObject;}

        EncapsulationDemo(){}
        EncapsulationDemo(int number,String stringValue,Object anObject)
        {
            this.number      = number;
            this.stringValue = stringValue;
            this.anObject    = anObject;
        }
    }
    //kata2
    public class Dinglemouse {

        private static int ONE_HUNDRED = 100;

        public static final Kata13.Dinglemouse INST = new Kata13.Dinglemouse();

        private final int value;

        private Dinglemouse() {
            value = ONE_HUNDRED;
        }

        public int plus100(int n) {
            return value + n;
        }

    }
    //kata3
    public class Fraction implements Comparable<Kata14.Fraction>
    {
        private final long top;
        private final long bottom;

        public Fraction(long numerator, long denominator) {
            top = numerator;
            bottom = denominator;
        }

        @Override
        public int hashCode() { return 17 * Long.hashCode(top) + Long.hashCode(bottom); }
        @Override
        public boolean equals(Object o) { return compareTo((Kata14.Fraction)o) == 0; }
        @Override
        public int compareTo(Kata14.Fraction f2){ return Long.compare(top * f2.bottom, f2.top * bottom); }

        // Your work here!
        public long getTop(){return top;}
        public long getBottom(){return bottom;}

        public static long[] normalizateDis(long aTop, long aBottom, long bTop, long bBottom)
        {
            long pTop = (aTop * bBottom) + (bTop * aBottom);
            long pBottom = aBottom * bBottom;
            for(int i = 1000; i > 1 ;i--)
            {
                while(pTop % i == 0 && pBottom % i == 0)
                {
                    pTop /= i;
                    pBottom /= i;
                }
            }
            return new long[]{pTop,pBottom};
        }

        //Add two fractions
        public Kata14.Fraction add(Kata14.Fraction f2) {
            long [] result = normalizateDis(this.top,this.bottom,f2.getTop(),f2.getBottom());
            return new Kata14.Fraction(result[0],result[1]);
        }

        @Override
        public String toString(){
            return top + "/" + bottom;
        }
    }
}
