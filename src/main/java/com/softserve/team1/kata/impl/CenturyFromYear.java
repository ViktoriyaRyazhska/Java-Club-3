package com.softserve.team1.kata.impl;

public class CenturyFromYear extends BaseKata{

    public static int century(int number) {
        if (number % 100 == 0) {
            return number / 100;
        } else {
            return number / 100 + 1;
        }
    }

    @Override
    public void test() {
        System.out.println("Enter a year to get a century :");
        int inputYear = scanner.nextInt();
        System.out.println("Centry is :" + century(inputYear));
    }
}
