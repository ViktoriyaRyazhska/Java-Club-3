package team3.main.java.romanS.appParts;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RockPaperScissors {
    public static void rockPaperScissors () {
        System.out.println ("Running Rock-paper-scissors.");
        readUserTurn();
    }
    private static void readUserTurn () {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Input your sign. ");
        System.out.println ("1 is rock, 2 is paper, 3 is scissors, 0 is quit from game.");
        int userInput = scanner.nextInt();
//        userInput = checkUserInput (userInput);
        int pcInput = generateEnemyTurn();
        compareTurns(userInput, pcInput);
    }
    private static int generateEnemyTurn () {
        int min = 1; int max = 3;
        int randomOption = ThreadLocalRandom.current().nextInt(min, max + 1);
        return randomOption;
    }
    private static int checkUserInput (int userOption) {
        Scanner scanner = new Scanner(System.in);
        while (userOption != 1 || userOption != 2 || userOption != 3) {
            System.out.println("Your option is invalid, please rewind input.");
            System.out.println ("1 is rock, 2 is paper, 3 is scissors ");
            userOption = scanner.nextInt();
        }
        return userOption;
    }
    private static void compareTurns (int userInput, int pcInput) {
        if (userInput == pcInput)
            System.out.println("Draw.");
        else if (userInput == 1 && pcInput == 2)
            System.out.println("Your rock was covered by paper, you have Lost.");
        else if (userInput == 1 && pcInput == 3)
            System.out.println("Your rock broke scissors, you Won.");
        else if (userInput == 2 && pcInput == 1)
            System.out.println("Your paper covered rock, you Won.");
        else if (userInput == 2 && pcInput == 3)
            System.out.println("Your paper being cut by scissors, you have Lost.");
        else if (userInput == 3 && pcInput == 1)
            System.out.println("Your scissors is broken by rock, you have Lost.");
        else if (userInput == 3 && pcInput == 2)
            System.out.println("Your scissors have cut paper, you Won.");
    }
}
