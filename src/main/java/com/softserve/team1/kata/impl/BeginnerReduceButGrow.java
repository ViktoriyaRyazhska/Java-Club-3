package com.softserve.team1.kata.impl;

import java.util.Arrays;
import java.util.Scanner;

public class BeginnerReduceButGrow extends BaseKata{

    private int[] arr;
    private Scanner scanner;

    public static int grow(int[] x) {

        int res = x[0];
        for (int i = 1; i < x.length; i++) {
            res *= x[i];
        }
        return res;
    }

    @Override
    public void test() {
        arr = new int[5];
        System.out.println("Given a non-empty array of integers, return the result of multiplying the values together in order.");

        System.out.println("Provide 5 integers");
        for (int i = 0; i < arr.length; i++){
            if(scanner.hasNextInt()){
                arr[i] = scanner.nextInt();
            }
        }
        System.out.println("Result: " + grow(arr));
    }
}
