package com.softserve.team1.kata.impl;

import java.util.Scanner;

public class TwiceAsOld extends BaseKata {

    public static int twiceAsOld(int dadYears, int sonYears) {
        return Math.abs(2 * sonYears - dadYears);
    }


    @Override
    public void test() {
        System.out.print("Enter dad years: ");
        Scanner in = new Scanner(System.in);

        int dadYears = in.nextInt();

        System.out.print("Enter son years: ");
        int sonYears = in.nextInt();

        System.out.println(twiceAsOld(dadYears, sonYears));
    }
}
