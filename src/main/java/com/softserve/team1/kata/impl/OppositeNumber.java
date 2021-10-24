package com.softserve.team1.kata.impl;

import java.util.Scanner;

public class OppositeNumber extends BaseKata{
    public static int opposite(int number) {
        return -number;
    }

    @Override
    public void test() {
        System.out.println("Enter number: ");
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        System.out.println(number + ": " + opposite(number));
    }
}
