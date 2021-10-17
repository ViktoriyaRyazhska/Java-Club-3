package com.club3.java;

import com.club3.java.impl.ConditionsImpl;

import java.util.Scanner;

public class Conditions {
    private ConditionsImpl conditionsImpl = new ConditionsImpl();

    public String divinity19() {
        System.out.println(" Is n divisible by x and y?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n,x,y");
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        return conditionsImpl.divinity19(n, x, y);
    }

    public String rps23() {
        System.out.println(" Rock Paper Scissors!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter for 1 player paper or scissors or rock");
        String p1 = scanner.nextLine();
        System.out.println("Enter for 2 player paper or scissors or rock");
        String p2 = scanner.nextLine();
        return conditionsImpl.rps23(p1, p2);
    }

    public int enough27() {
        System.out.println(" cap is the amount of people the bus can hold excluding the driver.\n" +
                "on is the number of people on the bus excluding the driver.\n" +
                "wait is the number of people waiting to get on to the bus excluding the driver.\n" +
                "If there is enough space, return 0, and if there isn't, return the number of passengers he can't take.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cap,on,wait");
        int cap = scanner.nextInt();
        int on = scanner.nextInt();
        int wait = scanner.nextInt();
        return conditionsImpl.enough27(cap, on, wait);
    }

    public int rentalCarCost31() {
        System.out.println(" Every day you rent the car costs $40. If you rent the car for 7 or more days, you get $50 off your total. \n" +
                "Alternatively, if you rent the car for 3 or more days, you get $20 off your total.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter for how many days ");
        int d = scanner.nextInt();
        return conditionsImpl.rentalCarCost31(d);
    }

    public int oppositeNumber() {
        System.out.println("\n Very simple, given a number, find its opposite.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();
        return conditionsImpl.oppositeNumber(number);
    }

    public String howOldWillIBeIn2099() {
        System.out.println("\n Your task is to write a function that takes two parameters: the year of birth and the year to count years in relation to. " +
                "\n As Philip is getting more curious every day he may soon want to know how many years it was until he would be born, so your function needs to work with both dates in the future and in the past.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth:");
        int birth = scanner.nextInt();
        System.out.println("Enter year to count years:");
        int yearIn = scanner.nextInt();
        return conditionsImpl.howOldWillIBeIn2099(birth, yearIn);
    }

    public String convertBooleanValuesToStrings() {
        System.out.println("\n Complete the method that takes a boolean value and return a \"Yes\" string for true, or a \"No\" string for false.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string:");
        String s = scanner.nextLine();
        return conditionsImpl.convertBooleanValuesToStrings(s);
    }

    public String trafficLight() {
        System.out.println("\n You're writing code to control your town's traffic lights. You need a function to handle each change from green, to yellow, to red, and then to green again." +
                "\n Complete the function that takes a string as an argument representing the current state of the light and returns a string representing the state the light should change to.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'green', 'red' or 'yellow':");
        String s = scanner.nextLine();
        return conditionsImpl.trafficLight(s);
    }

    public String bonusTime() {
        System.out.println("It's bonus time in the big city! The fatcats are rubbing their paws in anticipation... but who is going to make the most money?\n" +
                "\n" +
                "Build a function that takes in two arguments (salary, bonus). Salary will be an integer, and bonus a boolean.\n" +
                "\n" +
                "If bonus is true, the salary should be multiplied by 10. If bonus is false, the fatcat did not make enough money and must receive only his stated salary.");
        System.out.println("Enter salary and bonus status: ");
        Scanner scanner = new Scanner(System.in);
        int salary = scanner.nextInt();
        boolean bonus = scanner.nextBoolean();
        return conditionsImpl.bonusTime(salary, bonus);
    }

    public boolean isLove() {
        System.out.println("Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each." +
                "\nIf one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.\n" +
                "\n" +
                "Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.");
        System.out.println("Enter amount of petals for each flower: ");
        Scanner scanner = new Scanner(System.in);
        int flower1 = scanner.nextInt();
        int flower2 = scanner.nextInt();
        return conditionsImpl.isLove(flower1, flower2);
    }

    public String switchItUp() {
        System.out.println("When provided with a number between 0-9, return it in words.");
        System.out.println("\n Enter number from 0 to 9:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return conditionsImpl.switchItUp(number);
    }

    private void displayMenu() {
        System.out.println("\n Please, choose a task:" +
                "\n " +
                "\n 1. Opposite number" +
                "\n 2. How old I will be in 2099" +
                "\n 3. Convert Boolean value to String" +
                "\n 4. Traffic Light" +
                "\n 5. Is n divisible" +
                "\n 6. Rock Paper Scissors" +
                "\n 7. Is enough space" +
                "\n 8. Rental car cost" +
                "\n 9. Do I get a bonus?" +
                "\n 10. Opposites Attract" +
                "\n 11. Switch it Up" +
                "\n 12. Return to main menu");
    }


    public void runConditions() {
        displayMenu();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(oppositeNumber());
                    break;
                case 2:
                    System.out.println(howOldWillIBeIn2099());
                    break;
                case 3:
                    System.out.println(convertBooleanValuesToStrings());
                    break;
                case 4:
                    System.out.println(trafficLight());
                    break;
                case 5:
                    System.out.println(divinity19());
                    break;
                case 6:
                    System.out.println(rps23());
                    break;
                case 7:
                    System.out.println(enough27());
                    break;
                case 8:
                    System.out.println(rentalCarCost31());
                    break;
                case 9:
                    System.out.println(bonusTime());
                    break;
                case 10:
                    System.out.println(isLove());
                    break;
                case 11:
                    System.out.println(switchItUp());
                    break;
                case 12:
                    System.out.println("\n Welcome to main menu \n __________________________");
                    Menu menu = new Menu();
                    menu.runApplication();
                    break;
                default:
                    System.out.println("There are not number like this");
                    break;
            }
        } while (choice != 12);
    }

}
