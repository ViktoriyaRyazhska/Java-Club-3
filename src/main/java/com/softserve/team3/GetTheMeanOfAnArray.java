package team3.main.java.romanS.appParts;

import java.util.Scanner;

public class GetTheMeanOfAnArray {
    public static void getTheMeanOfAnArray () {
        System.out.println ("Searching mean of an array.");
        inputArray();
    }
    private static void inputArray () {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Input array using space between numbers.");
        String[] data = scanner.nextLine().split(" ");
        int[] array = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            array[i] = Integer.parseInt(data[i]);
        }
        int meanOfArray = searchMeanNumber(array);
        System.out.println ("mean number of an array = " + meanOfArray);
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
