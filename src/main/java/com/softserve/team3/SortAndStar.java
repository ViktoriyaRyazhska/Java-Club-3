package team3.main.java.romanS.appParts;

import java.util.Arrays;
import java.util.Scanner;

public class SortAndStar {
    public static void sortAndStar () {
        System.out.println ("Sorting string array, and adding stars.");
        readInput();
    }
    private static void readInput () {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Input words separated with spaces.");
        String inputString = scanner.nextLine();
        String stringArray [] = StringToStringArray(inputString);
        Arrays.sort(stringArray);
        String firstWord = stringArray [0];
        firstWord.replaceAll("", "***");
        System.out.println ("Sorted and starred first word is " + firstWord);
    }
    private static String [] StringToStringArray (String inputString) {
        String[] stringsArray = inputString.split(" ");
        for (String str : stringsArray) {
            str = removeSpaces(str);
        }
        return stringsArray;
    }
    private static String removeSpaces (String string) {
        return string.replaceAll(" ", "");
    }
}
