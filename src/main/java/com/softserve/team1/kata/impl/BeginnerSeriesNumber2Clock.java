package com.softserve.team1.kata.impl;

import java.util.Scanner;

public class BeginnerSeriesNumber2Clock extends BaseKata{
    private int h, m ,s;
    private Scanner scanner;

    public static int Past(int h, int m, int s)
    {
        if( h < 0 || h > 23 || m < 0 || m > 59 || s < 0 || s > 59 )
            return -1;

        return h*3600000 + m*60000 + s*1000;
    }

    @Override
    public void test() {
        scanner = new Scanner(System.in);
        System.out.println("task is to write a function which returns the time since midnight in milliseconds.");
        System.out.println("Provide number of hours");
        if(scanner.hasNextInt()){
            h = scanner.nextInt();
        }
        System.out.println("Provide number of minutes");
        if(scanner.hasNextInt()){
            m = scanner.nextInt();
        }System.out.println("Provide number of seconds");
        if(scanner.hasNextInt()){
            s = scanner.nextInt();
        }
        System.out.println("Result: " + Past(h,m,s));
    }
}
