package com.club3.java;

import com.club3.java.utils.*;

import java.util.Scanner;

public class OOP {

    public double areaOfRectangle() {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Enter height:");
        double height = scanner.nextDouble();
        System.out.println("Enter weight:");
        double weigh = scanner.nextDouble();
        return calculator.getTotalArea(new Rectangle(height, weigh));
    }

    public double areaOfSquare() {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Enter side:");
        double side = scanner.nextDouble();
        return calculator.getTotalArea(new Square(side));
    }

    public double areaOfTriangle() {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Enter triangle height:");
        double height = scanner.nextDouble();
        System.out.println("Enter triangle base:");
        double base = scanner.nextDouble();
        return calculator.getTotalArea(new Triangle(base, height));
    }

    public double areaOfCircle() {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Enter the radius:");
        double radius = scanner.nextDouble();
        return calculator.getTotalArea(new Circle(radius));
    }

    private void displayMenuForCalculatingSquareOfShapes() {
        System.out.println("\n Select the shape: " +
                "\n 1. Rectangle" +
                "\n 2. Square" +
                "\n 3. Triangle" +
                "\n 4. Circle" +
                "\n 5. Return to OOP");
    }

    private void areaCalculating() {
        System.out.println("\n Implement:\n" +
                "\n Calculator.getTotalArea()" +
                "\n Define the different shapes: `Square`, `Rectangle`, `Circle` and `Triangle`");
        Scanner scanner = new Scanner(System.in);
        displayMenuForCalculatingSquareOfShapes();
        int choice;
        do {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(areaOfRectangle());
                    break;
                case 2:
                    System.out.println(areaOfSquare());
                    break;
                case 3:
                    System.out.println(areaOfTriangle());
                    break;
                case 4:
                    System.out.println(areaOfCircle());
                    break;
                case 5:
                    System.out.println("Welcome to OOP" + "\n ___________________");
                    OOP oop = new OOP();
                    oop.runOOP();
                    break;
                default:
                    System.out.println("Invalid number");
                    break;
            }
        } while (choice != 5);
    }


    public class God {

        public Human[] create() {
            Human[] people = new Human[2];
            people[0] = new Man();
            people[1] = new Woman();

            return people;
        }
    }

    class Human {
    }

    class Man extends Human {

        @Override
        public String toString() {
            return "Adam is man";
        }
    }

    class Woman extends Human {
        @Override
        public String toString() {
            return "Eva is woman";
        }
    }


    public void godmenu() {
        System.out.println("\n You have to do God's job. The creation method must return an array of length 2 containing objects 0 for Man adn 1 for Woman\n" +
                "who you wonna to create?\n" +
                "0. Man\n" +
                "1. Woman\n" +
                "2. Back");

        Scanner scanner = new Scanner(System.in);
        God god = new God();
        Human[] paradise = god.create();
        int choice;

        do {
            choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.out.println(paradise[0]);
                    break;
                case 1:
                    System.out.println(paradise[1]);
                    break;
                case 2:
                    System.out.println("Welcome to OOP" + "\n ___________________");
                    OOP oop = new OOP();
                    oop.runOOP();
                    break;
                default:
                    System.out.println("Invalid number");
                    break;
            }
        } while (choice != 2);
    }



    private void displayMenu() {
        System.out.println("\n Please, choose a task:" +
                "\n " +
                "\n 1. Area Calculation" +
                "\n 2. Creating of people" +
                "\n 3. Return to main menu");
    }

    public void runOOP() {
        displayMenu();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    areaCalculating();
                    break;
                case 2:
                    godmenu();
                    break;
                case 3:
                    System.out.println("\n Welcome to main menu \n __________________________");
                    Menu menu = new Menu();
                    menu.runApplication();
                    break;
                default:
                    System.out.println("There are not number like this");
                    break;
            }
        } while (choice != 3);
    }
}
