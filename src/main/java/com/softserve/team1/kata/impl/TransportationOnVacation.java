package com.softserve.team1.kata.impl;

import java.util.Scanner;

public class TransportationOnVacation extends BaseKata{
    private Scanner scanner;
    public static int rentalCarCost(int d) {
        return d >= 7 ? d*40 - 50 : d >= 3 ? d*40 - 20 : d*40;
    }

    @Override
    public void test() {
        scanner = new Scanner(System.in);
        System.out.println(" Rental of the car costs $40. " +
                "If you rent the car for 7 or more days, you get $50 off your total. " +
                "Alternatively, if you rent the car for 3 or more days, you get $20 off your total.");
        System.out.println("Provide number of days");
        if(scanner.hasNextInt()){
            System.out.println("Total cost equals " + rentalCarCost(scanner.nextInt()));
        }
    }
}
