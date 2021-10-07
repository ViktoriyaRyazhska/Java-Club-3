package com.softserve.team1;

public class ReversedSequence {
    public static int[] reverse(int n){
        int [] newArr = new int[n];
        for(int i = 0; n > 0; i++){
            newArr[i] = n;
            n--;
        }
        return newArr;
    }
}
