package com.club3.java;

import java.util.Scanner;

public class Collections {

    private void unfinishedLoopBugFixing() {
        System.out.println("  public static List CreateList(int number) {\n" +
                "  \n" +
                "    List list = new ArrayList();\n" +
                "    \n" +
                "    for(int count = 1; count <= number; count++) {\n" +
                "      list.add(count);\n" +
                "    }\n" +
                "    return list;\n" +
                "  }");
    }

    private void displayMenu() {
        System.out.println("\n Please, choose a task:" +
                "\n " +
                "\n 1. Unfinished Loop - Bug Fixing" +
                "\n 2. Return to main menu");
    }

    public void runCollections() {
        displayMenu();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    unfinishedLoopBugFixing();
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
