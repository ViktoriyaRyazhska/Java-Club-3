package com.club3.java;

import java.util.Scanner;

public class Conditions {

    private String divinity19() {
        System.out.println(" Is n divisible by x and y?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n,x,y");
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

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

    private String rps23() {
        System.out.println(" Rock Paper Scissors!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter for 1 player paper or scissors or rock");
        String p1 = scanner.nextLine();
        System.out.println("Enter for 2 player paper or scissors or rock");
        String p2 = scanner.nextLine();
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

    private int enough27() {
        System.out.println(" cap is the amount of people the bus can hold excluding the driver.\n" +
                "on is the number of people on the bus excluding the driver.\n" +
                "wait is the number of people waiting to get on to the bus excluding the driver.\n" +
                "If there is enough space, return 0, and if there isn't, return the number of passengers he can't take.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cap,on,wait");

        int cap = scanner.nextInt();
        int on = scanner.nextInt();
        int wait = scanner.nextInt();

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

    private int rentalCarCost31() {
        System.out.println(" Every day you rent the car costs $40. If you rent the car for 7 or more days, you get $50 off your total. \n" +
                "Alternatively, if you rent the car for 3 or more days, you get $20 off your total.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter for how many days ");
        int d = scanner.nextInt();

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

    private int oppositeNumber() {
        System.out.println("\n Very simple, given a number, find its opposite.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();
        int oppositeNumber = 0;
        if (number > 0) {
            oppositeNumber = -number;
        }
        return oppositeNumber;
    }

    private String howOldWillIBeIn2099() {
        System.out.println("\n Your task is to write a function that takes two parameters: the year of birth and the year to count years in relation to. " +
                "\n As Philip is getting more curious every day he may soon want to know how many years it was until he would be born, so your function needs to work with both dates in the future and in the past.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth:");
        int birth = scanner.nextInt();
        System.out.println("Enter year to count years:");
        int yearIn = scanner.nextInt();

        if (birth < yearIn) {
            return "You are " + (yearIn - birth) + " years old.";
        } else if (birth > yearIn) {
            return "You will be born in " + (birth - yearIn) + " years.";
        } else {
            return "You were born this very year!";
        }
    }

    private String convertBooleanValuesToStrings() {
        System.out.println("\n Complete the method that takes a boolean value and return a \"Yes\" string for true, or a \"No\" string for false.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string:");
        String s = scanner.nextLine();
        if (s.equals("false")) {
            return "No";
        } else if (s.equals("true")) {
            return "Yes";
        } else {
            return "Please, write 'true' or 'false'";
        }
    }

    private String trafficLight() {
        System.out.println("\n You're writing code to control your town's traffic lights. You need a function to handle each change from green, to yellow, to red, and then to green again." +
                "\n Complete the function that takes a string as an argument representing the current state of the light and returns a string representing the state the light should change to.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'green', 'red' or 'yellow':");
        String s = scanner.nextLine();
        if (s.equals("green")) {
            return "yellow";
        } else if (s.equals("yellow")) {
            return "red";
        } else {
            return "green";
        }

    }

    private void displayMenu() {
        System.out.println("\n Please, choose a task:" +
                "\n " +
                "\n 1. Opposite number" +
                "\n 2. How old I will be in 2099" +
                "\n 3. Convert Boolean value to String" +
                "\n 4. Traffic Light" +
                "\n 5. Is n divisible" +
                "\n 6. Rock Paper Scissors" +
                "\n 7. Is enough space" +
                "\n 8. Rental car cost" +
                "\n 9. Return to main menu");
    }


    public void runConditions() {
        displayMenu();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(oppositeNumber());
                    break;
                case 2:
                    System.out.println(howOldWillIBeIn2099());
                    break;
                case 3:
                    System.out.println(convertBooleanValuesToStrings());
                    break;
                case 4:
                    System.out.println(trafficLight());
                    break;
                case 5:
                    System.out.println(divinity19());
                    break;
                case 6:
                    System.out.println(rps23());
                    break;
                case 7:
                    System.out.println(enough27());
                    break;
                case 8:
                    System.out.println(rentalCarCost31());
                    break;
                case 9:
                    System.out.println("\n Welcome to main menu \n __________________________");
                    Menu menu = new Menu();
                    menu.runApplication();
                    break;
                default:
                    System.out.println("There are not number like this");
                    break;
            }
        } while (choice != 9);
    }

}
