package team3.main.java.romanS.appParts;

import java.util.Scanner;

public class HowGoodAreYouReally {
    public static void howGoodAreYouReally () {
        System.out.println ("Searching how really good is grade");
        inputGrades();
    }
    private static void inputGrades () {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Input grade.");
        int grade = scanner.nextInt();
        System.out.println ("Input array using space between numbers.");
        Scanner scanner2 = new Scanner(System.in);
        String[] data = scanner2.nextLine().split(" ");
        int[] array = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            array[i] = Integer.parseInt(data[i]);
        }
        int meanOfArray = searchMeanNumber(array);
        if (meanOfArray < grade)
            System.out.println ("Your grade" +grade +" is better than average " + meanOfArray);
        else if (meanOfArray == grade)
            System.out.println ("Your grade" +grade +" is average " + meanOfArray);
        else
            System.out.println ("Your grade" +grade +" is worse than average " + meanOfArray);
    }
    private static int searchMeanNumber (int[] array) {
        int summNumber = 0;
        int meanNumber;
        for (int i = 0; i < array.length; i++) {
            summNumber += array[i];
        }
        meanNumber = summNumber / array.length;
        return meanNumber;
    }
    private static int checkUserInput (int userOption) {
        Scanner scanner = new Scanner(System.in);
        while (userOption < 0) {
            System.out.println("Your option is negative, please rewind input.");
            userOption = scanner.nextInt();
        }
        return userOption;
    }
}
