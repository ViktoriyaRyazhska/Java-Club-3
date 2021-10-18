package zub_denys;

import java.util.Scanner;

public class Divisible {
    public static boolean isDivisible(long n, long x,long y) {
        //        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter n: ");
//        long n = sc.nextLong();
//        System.out.println("Enter x: ");
//        long x = sc.nextLong();
//        System.out.println("Enter y: ");
//        long y = sc.nextLong();

        return n % x == 0 && n % y == 0 ? true : false;
    }
}
