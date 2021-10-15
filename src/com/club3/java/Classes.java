package com.club3.java;

import com.club3.java.utils.Block;
import com.club3.java.utils.Dinglemouse;
import com.club3.java.utils.Fraction;

import java.util.Scanner;

public class Classes {

    public Fraction fractionsClass() {
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

    private int dinglemouseClass() {
        System.out.println("The code provided has a method plus100 which is supposed to return the number of the parameter incremented by 100.\n" +
                "Fix the code so we can all go home early.");
        System.out.println("Enter Integer number: ");
        Dinglemouse dinglemouse = new Dinglemouse();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        return dinglemouse.plus100(n);
    }


    private String blockClass() {
        System.out.println("Enter Integer parameters to see volume and surface area of a block: ");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[]{scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        Block block = new Block(arr);
        return block.toString();
    }

    private void displayMenu() {
        System.out.println("\n Please, choose a task:" +
                "\n " +
                "\n 1. Fraction" +
                "\n 2. FIXME: Static electrickery" +
                "\n 3. Building blocks" +
                "\n 4. Return to main menu");
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
                    System.out.println(dinglemouseClass());
                    break;
                case 3:
                    System.out.println(blockClass());
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
