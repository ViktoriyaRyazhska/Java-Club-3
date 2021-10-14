package com.softserve.team1.kata.impl;

import com.softserve.team1.kata.InputType;

public class AllStarCodeChallengeNumber18 extends BaseKata{

    public static int strCount(String str, char letter) {
        int counter = 0;
        for(char ch : str.toCharArray()) {
            if(letter == ch) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public void test() {
        System.out.println("Enter any string : ");
        String stringInput = (String) readInput(InputType.STRING);
        System.out.println("And char to count : ");
        char anotherStringInput = (char) readInput(InputType.CHARACTER);
        System.out.println("Total sum of chars : " + strCount(stringInput, anotherStringInput));

    }
}
