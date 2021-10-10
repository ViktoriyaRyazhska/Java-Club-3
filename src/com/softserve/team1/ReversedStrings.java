package com.softserve.team1;

public class ReversedStrings {

    public static String solution(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }
}