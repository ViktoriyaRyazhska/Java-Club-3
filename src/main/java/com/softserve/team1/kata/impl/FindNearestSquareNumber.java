package com.softserve.team1.kata.impl;

import java.util.Scanner;

public class FindNearestSquareNumber extends BaseKata {
    private Scanner scanner;
    public static int nearestSq(final int n){
        return (int) Math.pow(Math.round(Math.sqrt(n)),2);
    }

    @Override
    public void test() {
        scanner = new Scanner(System.in);
        System.out.println("task is to find the nearest square number, nearest_sq(n), of a positive integer n.");
        System.out.println("Provide an integer");
        if(scanner.hasNextInt()) {
            System.out.println("Result: " + nearestSq(scanner.nextInt()));
        }
    }
}
