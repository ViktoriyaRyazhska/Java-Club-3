package com.softserve.Java_club_team_5;

import java.util.Scanner;

public class BooleanValueToString {

    public static String boolToWord(boolean b) {
        return (b ? "Yes" : "No");
    }

    public static void main(String[] args) {
        System.out.println("Enter 1 for true, 0 for false");
        int number;

        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        switch (number) {
            case 1:
                System.out.println(boolToWord(true));
                break;
            case 2:
                System.out.println(boolToWord(false));
                break;
            default:
                System.out.println("Undefined value");
        }
    }
}
