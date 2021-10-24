package com.softserve.team1.kata.impl;

import java.util.Scanner;

public class MultiplyingTwoNumbers extends BaseKata {

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public void test() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter second number: ");
        int num2 = in.nextInt();

        System.out.println("Result of multiplication " + num1 + " and " + num2 + " = " + multiply(num1, num2));
    }
}
