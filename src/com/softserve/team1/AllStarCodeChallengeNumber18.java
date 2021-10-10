package com.softserve.team1;

public class AllStarCodeChallengeNumber18 {

    public static int strCount(String str, char letter) {
        int counter = 0;
        for(char ch : str.toCharArray()) {
            if(letter == ch) {
                counter++;
            }
        }
        return counter;
    }
}