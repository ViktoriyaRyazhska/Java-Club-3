package com.club3.java;

import java.util.Scanner;

public class Collections {

    private void displayMenu() {
        System.out.println();
    }

    public void runCollections() {
        displayMenu();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    System.out.println("\n Welcome to main menu \n __________________________");
                    Menu menu = new Menu();
                    menu.runApplication();
                    break;
                default:
                    System.out.println("There are not number like this");
            }
        } while (choice != 2);
    }

}
