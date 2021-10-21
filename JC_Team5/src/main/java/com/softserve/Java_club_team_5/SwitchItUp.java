package com.softserve.Java_club_team_5;

import java.util.Scanner;

public class SwitchItUp {

    public static String convert(int number) {
        if (number < 10 && number >= 0) {
            switch (number) {
                case 0:
                    return "Zero";
                case 1:
                    return "One";
                case 2:
                    return "Two";
                case 3:
                    return "Three";
                case 4:
                    return "Four";
                case 5:
                    return "Five";
                case 6:
                    return "Six";
                case 7:
                    return "Seven";
                case 8:
                    return "Eight";
                case 9:
                    return "Nine";
            }
        }
        return "Invalid value.";
    }

}
