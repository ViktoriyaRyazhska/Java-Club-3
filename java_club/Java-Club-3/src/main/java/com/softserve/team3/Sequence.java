package com.softserve.team3;

public class Sequence {
    public static int[] reverse(int n){
        int[] sequence = new int[n];
        for (int i = 0; i < sequence.length; i++,n--) {
            sequence[i] = n;
        }
        return sequence;
    }
}
