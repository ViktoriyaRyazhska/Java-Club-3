package com.softserve.team1.kata.impl;

import java.util.Scanner;

public class CorrectTheMistakes extends BaseKata {

    public static String correct(String string) {
        return string.replaceAll("5","S")
                .replaceAll("0","O")
                .replaceAll("1","I");

    }

    @Override
    public void test() {
        System.out.println("Enter some string: ");
        Scanner in = new Scanner(System.in);

        String stringExample = in.nextLine();

        System.out.println("Edited string: " + correct(stringExample));
    }
}
