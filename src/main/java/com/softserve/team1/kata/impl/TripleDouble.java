package com.softserve.team1.kata.impl;

import java.util.Scanner;

public class TripleDouble extends BaseKata {

    public static String tripleTrouble(String one, String two, String three) {
        StringBuilder x = new StringBuilder();
        String[] allStrings = new String[]{one, two, three};

        for(int i = 0; i < one.length(); i++)
            for(String s : allStrings) x.append(s.charAt(i));

        return x.toString();
    }

    @Override
    public void test() {
        System.out.print("Enter first string: ");
        Scanner in = new Scanner(System.in);

        String someEx1 = in.nextLine();
        System.out.print("Enter second string: ");
        String someEx2 = in.nextLine();
        System.out.print("Enter third string: ");
        String someEx3 = in.nextLine();
        System.out.println("Result is: " + tripleTrouble(someEx1, someEx2, someEx3));
    }
}
