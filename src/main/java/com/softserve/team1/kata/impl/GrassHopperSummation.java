package com.softserve.team1.kata.impl;

import com.softserve.team1.kata.InputType;

public class GrassHopperSummation extends BaseKata{

    public static int summation(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }

    @Override
    public void test() {
        System.out.println("Enter value :");
        int sumVal = (int) readInput(InputType.INT);
        System.out.println("Summation value = " + summation(sumVal));
    }
}
