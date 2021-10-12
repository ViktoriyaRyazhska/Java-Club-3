package com.club3.java.impl;

import java.util.Scanner;

public class ConditionsImpl {

    public String divinity19(int n, int x, int y) {

        if (n % x == 0 && n % y == 0) {
            return "n = " + n + " is divisible on " + "x = " + x + " y = " + y;
        } else if (n % x == 0 && n % y != 0) {
            return "n = " + n + " is divisible on " + "x = " + x + " but not on y = " + y;
        } else if (n % x != 0 && n % y == 0) {
            return "n = " + n + " not divisible on " + "x = " + x + " but divisible on y = " + y;
        } else if (n % x != 0 && n % y != 0) {
            return "n = " + n + " not divisible on " + "x = " + x + " y = " + y;
        }
        return "Some problems";

    }

    public String rps23( String p1,String p2) {
        String p = "paper";
        String s = "scissors";
        String r = "rock";
        if (p1.equals(s) && p2.equals(p) || p1.equals(r) && p2.equals(s) || p1.equals(p) && p2.equals(r)) {
            return "Player 1 won!";
        } else if (p2.equals(s) && p1.equals(p) || p2.equals(r) && p1.equals(s) || p2.equals(p) && p1.equals(r)) {
            return "Player 2 won!";
        } else if (p1.equals(p2)) {
            return "Draw!";
        }
        return "Ups!";
    }

    public int enough27(int cap,int on,int wait) {

        int sum = 0;
        sum = on + wait;

        if (cap >= sum) {
            System.out.print("Enoughth plase empty : ");
            return cap - sum;
        } else if (cap - sum < 0) {
            System.out.print("Not enoughth plase on : ");
            return Math.abs(cap - sum);
        }
        return 000;
    }
    public int oppositeNumber(int number) {
        int oppositeNumber = 0;
        if (number > 0) {
            oppositeNumber = -number;
        }
        return oppositeNumber;
    }

    public int rentalCarCost31(int d) {
        int coast = 0;
        int days = 1;
        if (d < 3 && d > 0) {
            for (int i = 0; i < d; i++) {
                coast += 40;
                System.out.println("day: " + days + " prise :" + coast);
                days++;
            }
        } else if (d < 7 && d >= 3) {
            for (int i = 0; i < d; i++) {
                coast += 40;
                if (i == 2) {
                    coast -= 20;
                }
                System.out.println("day: " + days + " prise :" + coast);
                days++;
            }
        }
        if (d >= 7) {
            for (int i = 0; i < d; i++) {
                coast += 40;
                if (i == 2) {
                    coast -= 20;
                }
                if (i == 6) {
                    coast -= 30;
                }
                System.out.println("day: " + days + " prise :" + coast);
                days++;
            }
        }
        return coast;
    }

    public String howOldWillIBeIn2099(int birth, int yearIn) {
        if (birth < yearIn) {
            return "You are " + (yearIn - birth) + " years old.";
        } else if (birth > yearIn) {
            return "You will be born in " + (birth - yearIn) + " years.";
        } else {
            return "You were born this very year!";
        }
    }

    public String convertBooleanValuesToStrings(String s) {
        if (s.equals("false")) {
            return "No";
        } else if (s.equals("true")) {
            return "Yes";
        } else {
            return "Please, write 'true' or 'false'";
        }
    }

    public String trafficLight(String s) {
        if (s.equals("green")) {
            return "yellow";
        } else if (s.equals("yellow")) {
            return "red";
        } else {
            return "green";
        }
    }
}
