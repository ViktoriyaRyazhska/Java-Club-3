package com.softserve.team1.kata.impl;

import java.util.Objects;

public class MultiplicationKataImpl extends BaseKata {

    @Override
    public void test() {
        System.out.println("Hi dude. This kata implements method for two double numbers multiplication.");

        Double a = null;

        //I recommend to check this logic with invalid values, maybe we will need to add exception handling here.
        while (Objects.isNull(a)) {
            System.out.println("Please enter 1st number.");
            a = scanner.nextDouble();
        }

        Double b = null;

        //The same
        while (Objects.isNull(b)) {
            System.out.println("Please enter 2nd number.");
            b = scanner.nextDouble();
        }

        double result = multiply(a, b);

        System.out.println("Kata result is: " + result);
    }

    public static double multiply(double a, double b) {
        return a * b;
    }
}
