package com.softserve.team1;

public class SumOfPositive {

    public static int sum(int[] arr) {
        int sum = 0;
        for (int number : arr) {
            if (number > 0) {
                sum += number;
            }
        }
        return sum;
    }
}