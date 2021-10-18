package com.softserve.team1.kata.impl;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReversedSequence extends BaseKata{

    public static int[] reverse(int n){
        int [] newArr = new int[n];
        for(int i = 0; n > 0; i++){
            newArr[i] = n;
            n--;
        }
        return newArr;
    }

    @Override
    public void test() {
        assertArrayEquals(new int[]{5,4,3,2,1},ReversedSequence.reverse(5));

    }
}
