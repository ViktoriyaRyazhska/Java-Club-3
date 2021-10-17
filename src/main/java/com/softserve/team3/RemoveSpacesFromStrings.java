package team3.main.java.romanS.appParts;

import java.util.Scanner;

public class RemoveSpacesFromStrings {
    public static void removeSpacesFromStrings () {
        System.out.println ("Removing spaces from string.");
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Input string.");
        String string = scanner.nextLine();
        string = removeSpaces (string);
        System.out.println ("String without spaces " + string);
    }
    private static String removeSpaces (String string) {
        return string.replaceAll(" ", "");
    }
}
