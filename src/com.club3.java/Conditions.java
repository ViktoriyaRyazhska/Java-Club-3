package com.club3.java;

import java.util.Scanner;

public class Conditions {

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
                "\n 5. Return to main menu");
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
                    System.out.println("\n Welcome to main menu \n __________________________");
                    Menu menu = new Menu();
                    menu.runApplication();
                    break;
                default:
                    System.out.println("There are not number like this");
                    break;
            }
        } while (choice != 5);
    }
}
