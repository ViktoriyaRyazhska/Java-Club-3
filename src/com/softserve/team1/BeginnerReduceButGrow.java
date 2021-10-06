package com.softserve.team1;

public class BeginnerReduceButGrow {

    public static int grow(int[] x) {

        int res = x[0];
        for (int i = 1; i < x.length; i++) {
            res *= x[i];
        }
        return res;
    }

}
