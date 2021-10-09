package com.club3.java;

import java.util.Scanner;

public class Menu {
    public Scanner scanner = new Scanner(System.in);

    public void runApplication() {
        displayMenu();
        String choice;
        do {
            choice = scanner.next();
            switch (choice) {
                case "1":
                    System.out.println("You are in Basic Program`s tasks");
                    BasicProgram basicProgram = new BasicProgram();
                    basicProgram.runBasicProgram();
                    break;
                case "2":
                    System.out.println("You are in Classes` tasks");
                    Classes classes = new Classes();
                    classes.runClasses();
                    break;
                case "3":
                    System.out.println("You are in Conditions` tasks");
                    Conditions conditions = new Conditions();
                    conditions.runConditions();
                    break;
                case "4":
                    System.out.println("You are in Loops` tasks");
                    Loops loops = new Loops();
                    loops.runLoops();
                    break;
                case "5":
                    System.out.println("You are in OOP`s tasks");
                    OOP oop = new OOP();
                    oop.runOOP();
                    break;
                case "6":
                    System.out.println("You are in Strings` tasks");
                    Strings strings = new Strings();
                    strings.runStings();
                    break;
                case "7":
                    System.out.println("You are in Collections` tasks");
                    Collections collections = new Collections();
                    collections.runCollections();
                    break;
                case "8":
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("You input incorrect number. Please, try again!");
                    break;
            }
        } while (!choice.equals("8"));
    }

    private void displayMenu() {
        System.out.println("\n Please, choose the option:" +
                "\n " +
                "\n 1. Basic Program" +
                "\n 2. Classes" +
                "\n 3. Conditions" +
                "\n 4. Loops" +
                "\n 5. OOP" +
                "\n 6. Strings" +
                "\n 7. Collections" +
                "\n 8. Exit");
    }
}
