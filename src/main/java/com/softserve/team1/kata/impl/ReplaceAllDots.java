package com.softserve.team1.kata.impl;

import java.util.Scanner;

public class ReplaceAllDots extends BaseKata{
//    private String str;
    private Scanner scanner;
    public static String replaceDots(final String str) {
        return str.replace(".", "-");
    }

    @Override
    public void test() {
        scanner = new Scanner(System.in);
        System.out.println("code provided is supposed replace all the dots . in the specified String str with dashes -");
        System.out.println("Provide some string");
        if(scanner.hasNextLine()){
            System.out.println("Result: " + scanner.nextLine());
        }
    }
}
