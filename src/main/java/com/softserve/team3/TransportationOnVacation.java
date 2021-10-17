package team3.main.java.romanS.appParts;

import java.util.Scanner;

public class TransportationOnVacation {
    public static void transportationOnVacation () {
        System.out.println ("Searching price of car rent.");
        inputDays();
    }
    private static void inputDays () {
        Scanner scanner = new Scanner(System.in);
        int minValue = 1;
        int price = 0;
        int rent = 50;

        System.out.println ("Input number of days to rent");
        int days = scanner.nextInt();
        days = checkInput (days, minValue);
        if (days < 3)
            price = days * rent;
        else if (days > 3 && days < 7)
            price = days * rent - 20;
        else if (days > 7)
            price = days * rent - 50;
        System.out.println ("Price for car rent for " + days+ " days is $ " + price + ".");
    }
    private static int checkInput (int intToCheck, int minValue) {
        Scanner scanner = new Scanner(System.in);
        while (intToCheck < minValue) {
            System.out.println("One of values has wrong value please input new .");
            intToCheck = scanner.nextInt();
        }
        return intToCheck;
    }
}
