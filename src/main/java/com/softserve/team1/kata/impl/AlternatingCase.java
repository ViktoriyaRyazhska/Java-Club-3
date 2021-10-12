package com.softserve.team1.kata.impl;

import java.util.Scanner;

public class AlternatingCase extends BaseKata{
    private String str;
    private Scanner scanner;

    public static String toAlternativeString(String string) {

        StringBuilder sb = new StringBuilder(string);

        for(int i = 0; i < string.length(); i++){

            if(Character.isLowerCase(string.charAt(i))){
                sb.setCharAt(i, Character.toUpperCase(string.charAt(i)));
            }
            if(Character.isUpperCase(string.charAt(i))){
                sb.setCharAt(i, Character.toLowerCase(string.charAt(i)));
            }
        }
        return sb.toString();
    }

    @Override
    public void test() {
        scanner = new Scanner(System.in);
        System.out.println("Each lowercase letter becomes uppercase and each uppercase letter becomes lowercase");
        System.out.println("Provide some string");
        if(scanner.hasNextLine()){
            str = scanner.nextLine();
        }

        System.out.println("Alternative string is: " + toAlternativeString(str));
    }
}
