package com.softserve.team1.kata.impl;

import java.util.Arrays;
import java.util.Scanner;

public class BeginnerLostWithoutAMap extends BaseKata{
    private int[] arr;
    private Scanner scanner;
    public static int[] map(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        return arr;
    }

    @Override
    public void test() {
        arr = new int[5];
        scanner = new Scanner(System.in);
        System.out.println("Given an array of integers, return a new array with each value doubled.");

        System.out.println("Provide 5 integers");
        for (int i = 0; i < arr.length; i++){
            if(scanner.hasNextInt()){
                arr[i] = scanner.nextInt();
            }
        }
        System.out.println("Result: " + Arrays.toString(map(arr)));
    }
}
