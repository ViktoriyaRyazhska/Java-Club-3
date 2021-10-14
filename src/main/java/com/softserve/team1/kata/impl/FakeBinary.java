package com.softserve.team1.kata.impl;

import com.softserve.team1.kata.InputType;

public class FakeBinary extends BaseKata{

    public static String fakeBin(String numberString) {
        String result = "";
        for (int i = 0; i < numberString.length(); i++) {
            if (numberString.charAt(i) < '5') {
                result += '0';
            } else {
                result += '1';
            }
        }
        return result;
    }

    @Override
    public void test() {
        System.out.println("Enter any string : ");
        String numbersString = (String) readInput(InputType.STRING);
        System.out.println("Resulting string :" + fakeBin(numbersString));
    }
}
