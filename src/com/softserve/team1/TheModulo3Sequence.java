package com.softserve.team1;

public class TheModulo3Sequence {

    public static int sequence(int n) {
        int[] nums = new int[]{0, 1, 1, 2, 0, 2, 2, 1};
        return nums[(n-1)%8];
    }
}