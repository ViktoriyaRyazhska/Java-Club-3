package com.softserve.team1.kata.impl;

import java.util.Scanner;

public class FindThePosition extends BaseKata{
    private Scanner scanner;
    private char ch;
    public static String position(char alphabet)
    {
        int a = "abcdefghijklmnopqrstuvwxyz".indexOf(alphabet) + 1;
        return "Position of alphabet: " + a;
    }

    @Override
    public void test() {
        scanner = new Scanner(System.in);
        System.out.println("Finds position of the provided alphabet in abc");
        System.out.println("Provide an alphabet");
        ch = scanner.next(".").charAt(0);
        System.out.println("Position: " + position(ch));
    }
}
