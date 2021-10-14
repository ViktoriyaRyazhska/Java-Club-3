package com.softserve.team1.kata.impl;

import com.softserve.team1.kata.InputType;

import java.util.Scanner;

public class ThinkfulNumberDrillsPixelartPlanning extends BaseKata {

    public static boolean isDivisible(int wallLength, int pixelSize) {
        return wallLength % pixelSize == 0;
    }

    @Override
    public void test() {

        System.out.println("Please, input wall length : ");
        int num1 =  (int)readInput(InputType.INT);
        System.out.println("Please, input pixel size : ");
        int num2 =  (int)readInput(InputType.INT);
        System.out.println(isDivisible(num1, num2));

    }

}
