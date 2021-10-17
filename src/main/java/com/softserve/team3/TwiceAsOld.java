package team3.main.java.romanS.appParts;

import java.util.Scanner;

public class TwiceAsOld {
    public static void twiceAsOld () {
        System.out.println ("Searching in how many years father will be twice as old as son.");
        inputAges();
    }
    private static void inputAges () {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Input fathers age");
        int fathersAge = scanner.nextInt();
        fathersAge = checkInput (fathersAge, 18, 120);
        System.out.println ("Input sons age");
        int sonsAge = scanner.nextInt();
        sonsAge = checkInput (sonsAge, 0, fathersAge - 18);
        int ageDifference = calculateDoubleAge(fathersAge, sonsAge);
        if (ageDifference >= 0)
            System.out.println("Father will be twice as old as son in " + ageDifference + " years.");
        else
            System.out.println("Father was twice as old as son in " + ageDifference * -1 + " years.");
    }
    private static int calculateDoubleAge (int fathersAge, int sonsAge) {
        int ageDifference = fathersAge - 2 * sonsAge;
        return ageDifference;
    }
    private static int checkInput (int intToCheck, int minValue, int maxvalue) {
        Scanner scanner = new Scanner(System.in);
        while (intToCheck < minValue || intToCheck > maxvalue) {
            System.out.println("One of values has wrong value please input new .");
            intToCheck = scanner.nextInt();
        }
        return intToCheck;
    }
}
