package com.softserve.team1.kata.impl;

import java.util.Scanner;

public class ConvertANumberToAString extends BaseKata{
    private int num;
    private Scanner scanner;

    public static String numberToString(int num) {
        return Integer.toString(num);
    }

    @Override
    public void test() {
        scanner = new Scanner(System.in);
        System.out.println(" function that can transform a number into a string.");
        System.out.println("Provide an integer");
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        }
        System.out.println("Result:" + numberToString(num).getClass());
    }
}
