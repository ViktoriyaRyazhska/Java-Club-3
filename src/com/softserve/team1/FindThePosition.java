package com.softserve.team1;

public class FindThePosition {
    public static String position(char alphabet)
    {
        int a = "abcdefghijklmnopqrstuvwxyz".indexOf(alphabet) + 1;
        return "Position of alphabet: " + a;
    }
}
