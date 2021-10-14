package com.softserve.team1.kata.impl;

import com.softserve.team1.kata.InputType;

public class CountingSheepDotDotDot extends BaseKata {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i]) {
                counter += 1;
            }
        }
        return counter;
    }

    @Override
    public void test() {
        System.out.println("Enter array length :");
        int value = (int) readInput(InputType.INT);
        Boolean[] sheeps = new Boolean[value];
        for (int i = 0; i < value; i++) {
            System.out.println("Enter array value with index : " + i);
            sheeps[i] = (Boolean) readInput(InputType.BOOLEAN);
        }
        System.out.println("Number of sheeps: " + countSheeps(sheeps));

    }
}
