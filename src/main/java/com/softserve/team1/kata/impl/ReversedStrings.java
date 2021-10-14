package com.softserve.team1.kata.impl;

import com.softserve.team1.kata.InputType;

public class ReversedStrings extends BaseKata {

    public static String solution(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }

    @Override
    public void test() {
        System.out.println("Enter any string to reverse :");
        String stringInp = (String) readInput(InputType.STRING);
        System.out.println("Reversed string :" + solution(stringInp));
    }
}
