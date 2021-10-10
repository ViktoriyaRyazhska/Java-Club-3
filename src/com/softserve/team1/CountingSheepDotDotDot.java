package com.softserve.team1;

public class CountingSheepDotDotDot {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i]) {
                counter += 1;
            }
        }
        return counter;
    }
}