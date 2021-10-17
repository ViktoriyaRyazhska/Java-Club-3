package com.club3.java;

import com.club3.java.impl.BasicProgramImpl;

import java.util.Scanner;

public class BasicProgram {

    private BasicProgramImpl basicProgramImpl = new BasicProgramImpl();

    public double getVolumeOfCuboid3() {
        System.out.println(" Volume of a Cuboid");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length,width,height ");
        double lengs = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        return basicProgramImpl.getVolumeOfCuboid3(lengs,width,height) ;
    }

    public int past7() {
        System.out.println(" write a function which returns the time since midnight in milliseconds.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter h,m,s ");
        int hours = scanner.nextInt();
        int min = scanner.nextInt();
        int sec = scanner.nextInt();
        return basicProgramImpl.past7(hours,min,sec);
    }

    public String weatherInfo11() {
        System.out.println(" convert fahrenheit to celsius");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter farenheit");
        int far = scanner.nextInt();
       return basicProgramImpl.weatherInfo11(far);
    }


    public int multiplyTwoNumbers() {
        System.out.println("\n Implement a function which multiplies two numbers.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int one = scanner.nextInt();
        System.out.println("Enter second number");
        int two = scanner.nextInt();
        return basicProgramImpl.multiplyTwoNumbers(one, two);
    }

    public int integerToBinary() {
        System.out.println("\n Given a non-negative integer n, write a function to_binary/ToBinary which returns that number in a binary format.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number: ");
        int n = scanner.nextInt();
        return basicProgramImpl.integerToBinary(n);
    }

    public String ageRangeCompatibilityEquation() {
        System.out.println("\n Given an integer (1 <= n <= 100) representing a person's age, return their minimum and maximum age range." +
                "\n Return your answer in the form [min]-[max]");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        return basicProgramImpl.ageRangeCompatibilityEquation(age);
    }

    public int doubleInteger() {
        System.out.println("You need to double the integer and return it.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Integer number: ");
        int i = scanner.nextInt();
        return basicProgramImpl.doubleInteger(i);
    }

    public String greet() {
        System.out.println("Jenny has written a function that returns a greeting for a user. +" +
                "\n However, she's in love with Johnny, and would like to greet him slightly different. +" +
                "\n She added a special case to her function, but she made a mistake.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of a boy: ");
        String name = scanner.next();
        return basicProgramImpl.greet(name);
    }

    public int makeNegative() {
        System.out.println("In this simple assignment you are given a number and have to make it negative. " +
                "\nBut maybe the number is already negative?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Integer number: ");
        int x = scanner.nextInt();
        return basicProgramImpl.makeNegative(x);
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
                "\n 7. Double Integer" +
                "\n 8. Jenny's secret message" +
                "\n 9. Return Negative" +
                "\n 10. Return to main menu");
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
                    System.out.println(doubleInteger());
                    break;
                case 8:
                    System.out.println(greet());
                    break;
                case 9:
                    System.out.println(makeNegative());
                    break;
                case 10:
                    System.out.println("\n Welcome to main menu \n __________________________");
                    Menu menu = new Menu();
                    menu.runApplication();
                    break;
                default:
                    System.out.println("There are not number like this");
                    break;
            }

        } while (choice != 10);
    }

}
