package com.softserve.team1.kata.impl;

import java.util.Scanner;

public class ConvertToBinary extends BaseKata {

    public static int toBinary(int n) {
        return n > 1 ? toBinary(n / 2) * 10 + n % 2 : n;
    }


    @Override
    public void test() {
        System.out.println("Enter number: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if(number < 0) number *= -1;

        System.out.println(number + " in binary system is: " + toBinary(number));
    }
}
