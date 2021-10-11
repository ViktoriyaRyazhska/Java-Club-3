package zub_denys;

import java.util.Scanner;

public class Divisible {
    public static boolean isDivisible(long n, long x, long y) {
        return n % x == 0 && n % y == 0 ? true : false;
    }

    public static void main(String[] args) {
        //System.out.println(isDivisible(10,2,5));
        //System.out.println(isDivisible(10,3,5));

    }

}
