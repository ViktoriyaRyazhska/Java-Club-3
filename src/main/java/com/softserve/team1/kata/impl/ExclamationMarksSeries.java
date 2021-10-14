package com.softserve.team1.kata.impl;

import com.softserve.team1.kata.InputType;

public class ExclamationMarksSeries extends BaseKata {

    public static String remove(String s, int n) {
        for (int i = 0; i < n; i++) {
            s = s.replaceFirst("!", "");
        }
        return s;
    }

    @Override
    public void test() {
        System.out.println("Enter any string with (!) - symbols : ");
        String anyInpString = (String) readInput(InputType.STRING);
        System.out.println("Enter value to remove (!) - symbols : ");
        int numToReplace = (int) readInput(InputType.INT);
        System.out.println("String with removed (!) symbols : " + remove(anyInpString, numToReplace));
    }
}
