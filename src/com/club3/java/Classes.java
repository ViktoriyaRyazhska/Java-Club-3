package com.club3.java;

import com.club3.java.utils.classes.Fraction;

import java.util.Scanner;

public class Classes {

    private Fraction fractionsClass() {
        System.out.println("\n You are provided with a skeleton of the class 'Fraction', which accepts two arguments (numerator, denominator)." +
                "\n Your task is to make this class string representable, and addable while keeping the result in the minimum representation possible.\n" +
                "\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the top:");
        long top = scanner.nextLong();
        System.out.println("Enter the bottom:");
        long bottom = scanner.nextLong();
        System.out.println("Enter the new top:");
        long newTop = scanner.nextLong();
        System.out.println("Enter the new bottom:");
        long newBottom = scanner.nextLong();
        Fraction fraction = new Fraction(top, bottom);
        return fraction.add(new Fraction(newTop, newBottom));
    }

    private void displayMenu() {
        System.out.println("\n Please, choose a task:" +
                "\n " +
                "\n 1. Fraction" +
                "\n 2. Return to main menu");
    }

    public void runClasses() {
        displayMenu();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(fractionsClass());
                    break;
                case 2:
                    System.out.println("\n Welcome to main menu \n __________________________");
                    Menu menu = new Menu();
                    menu.runApplication();
                    break;
                default:
                    System.out.println("There are not number like this");
                    break;
            }

        } while (choice != 2);
    }
}
