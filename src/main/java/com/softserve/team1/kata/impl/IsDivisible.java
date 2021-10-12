package com.softserve.team1.kata.impl;

import java.util.Scanner;

public class IsDivisible extends BaseKata {

    private int n,x,y;
    private Scanner scanner;

    public static boolean isDivisible(long n, long x, long y) {
        return n % x == 0 && n % y == 0;
    }

    @Override
    public void test() {
        scanner = new Scanner(System.in);
        System.out.println("a function that checks if a number n is divisible by two numbers x AND y. All inputs are positive, non-zero digits");
        System.out.println("Provide n");
        if(scanner.hasNextInt()){
            n = scanner.nextInt();
        }
        System.out.println("Provide x");
        if(scanner.hasNextInt()){
            x = scanner.nextInt();
        }
        System.out.println("Provide y");
        if(scanner.hasNextInt()){
            y = scanner.nextInt();
        }
        System.out.println(isDivisible(n,x,y) ? "Divisible" : "Not divisible");
    }
}
