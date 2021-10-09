package com.club3.java;

import java.util.Scanner;

public class BasicProgram {


    public double getVolumeOfCuboid3() {
        System.out.println(" Volume of a Cuboid");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length,width,height ");
        double lengs = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        return lengs * width * height ;
    }

    public int past7() {
        System.out.println(" write a function which returns the time since midnight in milliseconds.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter h,m,s ");
        int hours = scanner.nextInt();
        int min = scanner.nextInt();
        int sec = scanner.nextInt();
        int res = 0;
        if (hours <= 23 && hours >= 0) {
            if (min <= 59 && min >= 0) {
                if (sec >= 0) {
                    res = ((hours * 3600) + (min * 60) + (sec)) * 1000;
                }
            }
        }
        return res;
    }

    public String weatherInfo11() {
        System.out.println(" convert fahrenheit to celsius");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter farenheit");
        int far = scanner.nextInt();
        double cels = 0;
        cels = ((far - 32) * (5.0 / 9.0));
        if (cels > 0) {
            return cels + " is above freezing temperature";
        } else {
            return cels + " is freezing temperature";
        }
    }


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
                "\n 4. Volume of a Cuboid" +
                "\n 5. Time since midnight in milliseconds" +
                "\n 6. Fahrenheit to celsius" +
                "\n 7. Return to main menu");
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
                    System.out.println(getVolumeOfCuboid3());
                    break;
                case 5:
                    System.out.println(past7());
                    break;
                case 6:
                    System.out.println(weatherInfo11());
                    break;
                case 7:
                    System.out.println("\n Welcome to main menu \n __________________________");
                    Menu menu = new Menu();
                    menu.runApplication();
                    break;
                default:
                    System.out.println("There are not number like this");
                    break;
            }

        } while (choice != 7);
    }

}


