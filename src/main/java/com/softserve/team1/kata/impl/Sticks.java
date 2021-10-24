package com.softserve.team1.kata.impl;

import java.util.Scanner;

public class Sticks extends BaseKata {
    public static int makeMove(int sticks) {
        return sticks % 4;
    }

    @Override
    public void test() {
        System.out.print("Enter count of sticks: ");
        Scanner in = new Scanner(System.in);

        int sticksCount = in.nextInt();
        System.out.println("Result is " + makeMove(sticksCount));
    }
}
