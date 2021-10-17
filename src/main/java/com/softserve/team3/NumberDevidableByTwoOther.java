package team3.main.java.romanS.appParts;

import java.util.Scanner;

public class NumberDevidableByTwoOther {
    public static void numberDevidableByTwoOther () {
        System.out.println ("Finding if number devidable by two others.");
        inputNumbers();
    }
    private static void inputNumbers () {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Input number to be checked");
        int numberToBeChecked = scanner.nextInt();
        System.out.println ("Input first devide-by number");
        int numberToCheck1 = scanner.nextInt();
        System.out.println ("Input second devide-by number");
        int numberToCheck2 = scanner.nextInt();
        checkIfNumberDevidable (numberToBeChecked, numberToCheck1, numberToCheck2);
    }
    private static void checkIfNumberDevidable (int numberToCheck, int number1, int number2) {
        if (numberToCheck % number1 == 0 && numberToCheck % number2 == 0)
            System.out.println ("Number to check "+ numberToCheck +" is devidable by both checking numbers.");
        else if (numberToCheck % number1 == 0)
            System.out.println ("Number to check "+ numberToCheck +" is devidable by first number " + number1);
        else if (numberToCheck % number2 == 0)
            System.out.println ("Number to check "+ numberToCheck +" is devidable by second number " + number2);
        else if (numberToCheck % number1 != 0 && numberToCheck % number2 != 0)
            System.out.println ("Number to check is not devidable by any input numbers first number.");
        else
            System.out.println ("Something went wrong.");
    }
}
