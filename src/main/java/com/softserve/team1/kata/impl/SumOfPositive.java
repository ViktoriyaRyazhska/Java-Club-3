package com.softserve.team1.kata.impl;

import com.softserve.team1.kata.InputType;

public class SumOfPositive extends BaseKata{

    public static int sum(int[] arr) {
        int sum = 0;
        for (int number : arr) {
            if (number > 0) {
                sum += number;
            }
        }
        return sum;
    }

    @Override
    public void test() {

        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter array value with index : " + i);
            arr[i] = (int) readInput(InputType.INT);
        }
        System.out.println("Sum of positive: " + sum(arr));
    }
}
