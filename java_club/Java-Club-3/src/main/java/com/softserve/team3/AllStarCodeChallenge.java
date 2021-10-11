package com.softserve.team3;

public class AllStarCodeChallenge {
    public static int strCount(String str, char letter) {
        return (int) str.chars().filter(x -> x == letter).count();
    }
}
