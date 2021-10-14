package com.softserve.team1.kata.impl;

import com.softserve.team1.kata.InputType;

public class TheModulo3Sequence extends BaseKata {

    public static int sequence(int n) {
        int[] nums = new int[]{0, 1, 1, 2, 0, 2, 2, 1};
        return nums[(n-1)%8];
    }

    @Override
    public void test() {
        System.out.println("Enter value to find sequence");
        int inputSequenceVal = (int) readInput(InputType.INT);
        System.out.println("Nth number of sequence : " + sequence(inputSequenceVal));
    }
}
