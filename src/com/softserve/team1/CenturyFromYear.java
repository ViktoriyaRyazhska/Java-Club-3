package com.softserve.team1;

public class CenturyFromYear {

    public static int century(int number) {
        if (number % 100 == 0) {
            return number / 100;
        } else {
            return number / 100 + 1;
        }
    }
}