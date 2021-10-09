package com.club3.java;

import java.util.Scanner;

public class BasicProgram {

    private int multiplyTwoNumbers() {
        System.out.println("\n Implement a function which multiplies two numbers.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int one = scanner.nextInt();
        System.out.println("Enter second number");
        int two = scanner.nextInt();
        return one * two;
    }

    private int integerToBinary() {
        System.out.println("\n Given a non-negative integer n, write a function to_binary/ToBinary which returns that number in a binary format.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number: ");
        int n = scanner.nextInt();
        String m = Integer.toBinaryString(n);
        return Integer.parseInt(m);
    }

    private String ageRangeCompatibilityEquation() {
        System.out.println("\n Given an integer (1 <= n <= 100) representing a person's age, return their minimum and maximum age range." +
                "\n Return your answer in the form [min]-[max]");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        int min;
        int max;
        if (age <= 14) {
            min = (int) (age - (0.10 * age));
            max = (int) (age + (0.10 * age));
        } else {
            min = age / 2 + 7;
            max = (age - 7) * 2;
        }
        return min + "-" + max;
    }

    private void displayMenu() {
        System.out.println("\n Please, choose a task:" +
                "\n " +
                "\n 1. Multiply two numbers" +
                "\n 2. Convert to Binary" +
                "\n 3. Age range compatibility equation" +
                "\n 4. Return to main menu");
    }

    public void runBasicProgram() {
        displayMenu();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(multiplyTwoNumbers());
                    break;
                case 2:
                    System.out.println(integerToBinary());
                    break;
                case 3:
                    System.out.println(ageRangeCompatibilityEquation());
                    break;
                case 4:
                    System.out.println("\n Welcome to main menu \n __________________________");
                    Menu menu = new Menu();
                    menu.runApplication();
                    break;
                default:
                    System.out.println("There are not number like this");
                    break;
            }

        } while (choice != 4);
    }
}


