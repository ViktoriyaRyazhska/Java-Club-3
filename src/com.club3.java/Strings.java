package com.club3.java;

import java.util.Scanner;

public class Strings {

    private String numberToString51() {
        System.out.println("Int to String \nEnter Int");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String s=String.valueOf(num);

        return s;
    }

    private String replaceDots55() {
        System.out.println("Enter some String with .");
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String replaceString=s1.replaceAll("\\.","-");
        return replaceString;
    }

    private String position59()
    {
        System.out.println("Enter some char");
        Scanner scanner = new Scanner(System.in);
        char alphabet = scanner.next().charAt(0);
        int position = 0 ;
        char [] abc_arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for (int i = 0; i < abc_arr.length; i++)
        {
            position ++;
            if (alphabet == abc_arr[i])
            {
                return "Position of alphabet: " + String.valueOf(position);
            }

        }
        return "Ups!";
    }

    private String abbrevName63() {

        System.out.println("Enter name and subname");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String upper = name.toUpperCase();

        if (name.contains(" "))
        {
            return String.valueOf(upper.charAt(0)) + "."+ String.valueOf(upper.charAt(upper.indexOf(' ')+1)) ;
        }

        return "";
    }

    private void displayMenu() {
        System.out.println("\n Please, choose a task:" +
                "\n " +
                "\n 1. Int to String" +
                "\n 2. Return to main menu");
    }

    public void runStings() {
        displayMenu();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(numberToString51());
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
