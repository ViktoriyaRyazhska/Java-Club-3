package team3.main.java.romanS.appParts;

import java.util.Scanner;

public class ClockToMillisAfterMidnight {
    public static void clockToMillisAfterMidnight () {
        System.out.println ("Finding milliseconds after midnight.");
        inputTime();
    }
    private static void inputTime () {
        int millisecondsAfterMidnight;
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Input hour");
        int hours = scanner.nextInt();
        checkInput (hours, 24);
        System.out.println ("Input minutes");
        int minutes = scanner.nextInt();
        checkInput (minutes, 60);
        System.out.println ("Input seconds");
        int seconds = scanner.nextInt();
        checkInput (seconds, 60);
        millisecondsAfterMidnight = calculateMilliseconds(hours, minutes, seconds);
        System.out.println ("Number of milliseconds past last midnight is " + millisecondsAfterMidnight);
    }
    private static int checkInput (int intToCheck, int maxValue) {
        Scanner scanner = new Scanner(System.in);
        while (intToCheck <= 0 || intToCheck > maxValue) {
            System.out.println("One of values has wrong value please input new .");
            intToCheck = scanner.nextInt();
        }
        return intToCheck;
    }
    private static int calculateMilliseconds (int hours, int minutes, int seconds) {
        int millisAfterMidnight = (((hours * 60 + minutes) * 60) + seconds) * 1000;
        return millisAfterMidnight;
    }
}
