package team3.main.java.romanS.appParts;

import java.util.Scanner;

public class TwentyOneSticks {
    public static void twentyOneSticks () {
        System.out.println ("Playing Unwinnable 21 sticks game.");
        System.out.println ();
        int sticks = 21;
        while (sticks > 0) {
            System.out.println ("PC is taking sticks.");
            int sticksTakenPc = pcTakeSticks (sticks);
            System.out.print ("Sticks left : "+ sticks +" Take 1-3 sticks: ");
            System.out.println ("PC is taking " + sticksTakenPc + " stick(s).");
            sticks -= sticksTakenPc;
            if (sticks <= 0) {
                System.out.println ("PC won. ");
                break;
            }
            System.out.println ("Your turn.");
            System.out.print ("Sticks left : "+ sticks +" Take 1-3 sticks: ");
            Scanner scanner = new Scanner(System.in);
            int playerSticks = scanner.nextInt();
            playerSticks = checkInput (playerSticks, 1, 3);
            sticks -= playerSticks;
            System.out.println ();
            if (sticks <= 0) {
                System.out.println ("You won. Somehow... Looks like bug actually. Please report it to my e-mail.");
                break;
            }
        }
    }
    public static int pcTakeSticks (int sticks) {
        int sticksTaken;
        if (sticks > 4)
            sticksTaken = sticks % 4;
        else if (sticks < 4)
            sticksTaken = sticks;
        else
            sticksTaken = 2;
        return sticksTaken;
    }

    private static int checkInput (int intToCheck, int minValue, int maxvalue) {
        Scanner scanner = new Scanner(System.in);
        while (intToCheck < minValue || intToCheck > maxvalue) {
            System.out.println("One of inputs has wrong value, please input new .");
            intToCheck = scanner.nextInt();
        }
        return intToCheck;
    }
}
