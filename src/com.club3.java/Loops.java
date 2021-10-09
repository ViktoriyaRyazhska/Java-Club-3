package com.club3.java;

import java.util.Scanner;

public class Loops {

    private int getTheMeanOfAnArray() {
        System.out.println("\n It's the academic year's end, fateful moment of your school report. " +
                "\n The averages must be calculated. All the students come to you and entreat you to calculate their average for them.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = scanner.nextInt();
        int[] marks = new int[size];
        int averageMark = 0;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element: " + i);
            marks[i] = scanner.nextInt();
            sum += marks[i];
            averageMark = sum / size;
        }
        return averageMark;
    }

    private String howGoodAreYouReally() {
        System.out.println("\n There was a test in your class and you passed it. Congratulations!" +
                "\n But you're an ambitious person. You want to know if you're better than the average student in your class." +
                "\n You receive an array with your peers' test scores. Now calculate the average and compare your score!" +
                "\n Return True if you're better, else False!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your average mark:");
        int yourMark = scanner.nextInt();
        System.out.println("Enter the size of array:");
        int arraySize = scanner.nextInt();
        int[] classPoints = new int[arraySize];
        int averageClassPoint = 0;
        int sum = 0;
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Enter the element: " + i);
            classPoints[i] = scanner.nextInt();
            sum += classPoints[i];
            averageClassPoint = sum / arraySize;
        }
        if (averageClassPoint < yourMark) {
            return "True";
        } else {
            return "False";
        }
    }

    private int twiceAsOld() {
        System.out.println("\n Your function takes two arguments:" +
                "\n current father's age (years)" +
                "\n current age of his son (years)" +
                "\n Сalculate how many years ago the father was twice as old as his son (or in how many years he will be twice as old).");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter father`s age:");
        int dadYears = scanner.nextInt();
        System.out.println("Enter son`s age:");
        int sonYears = scanner.nextInt();
        return Math.abs((sonYears * 2) - dadYears);
    }

    //don`t finished

    private int twentyOneStick() {
        System.out.println("\n In this game, there are 21 sticks lying in a pile. Players take turns taking 1, 2, or 3 sticks. The last person to take a stick wins.");
        Scanner scanner = new Scanner(System.in);
        int sticks = scanner.nextInt();
        int result = sticks % 4;
        return result;
    }

    private void displayMenu() {
        System.out.println("\n Please, choose a task:" +
                "\n " +
                "\n 1. Get the mean of an array" +
                "\n 2. How good are you really" +
                "\n 3. Twice as odd" +
                "\n 4. Twenty-one stick" +
                "\n 5. Return to main menu");
    }

    public void runLoops() {
        displayMenu();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(getTheMeanOfAnArray());
                    break;
                case 2:
                    System.out.println(howGoodAreYouReally());
                    break;
                case 3:
                    System.out.println(twiceAsOld());
                    break;
                case 4:
                    System.out.println(twentyOneStick());
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
