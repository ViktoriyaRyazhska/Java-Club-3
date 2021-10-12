package com.softserve.team1.kata.impl;

import java.util.Scanner;

public class AbbreviateA2WordsName extends BaseKata{
    private Scanner scanner;
    private String name;

    public static String abbrevName(String name) {
        return (name.charAt(0) + "." + (name.charAt(name.indexOf(" ")+1))).toUpperCase();
    }

    @Override
    public void test() {
        scanner = new Scanner(System.in);
//        name = null;
        System.out.println("Converts a name into initials.");
        System.out.println("Input your name and surname: ");
        if(scanner.hasNextLine()){
            name = scanner.nextLine();
        }
        System.out.println("Your initials are: " + abbrevName(name));
    }
}
