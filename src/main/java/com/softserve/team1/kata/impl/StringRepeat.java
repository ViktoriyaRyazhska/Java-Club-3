package com.softserve.team1.kata.impl;

import com.softserve.team1.kata.InputType;

public class StringRepeat extends BaseKata{

    public static String repeatStr(final int repeat, final String string) {
        String result = "";
        for (int i = 0; i < repeat; i++) {
            result = result + string;
        }
        return result;
    }

    @Override
    public void test() {
        System.out.println("Enter number to repeat : ");
        int repeatnum = (int) readInput(InputType.INT);
        System.out.println("Enter any string :");
        String stringToRep = (String) readInput(InputType.STRING);
        System.out.println(repeatStr(repeatnum, stringToRep));
    }
}
