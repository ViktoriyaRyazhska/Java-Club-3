package team3.main.java.romanS.appParts;

import java.util.Scanner;

public class ParseNiceIntFromString {
    public static void parseNiceIntFromString () {
        String textString = inputString();
        int integer = refineInt(textString);
        System.out.println ("In string there was ints like this: " + integer);
    }
    private static String inputString () {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Input text.");
        String string = scanner.nextLine();
        return string;
    }
    private static int refineInt(String string) {
        string = string.replaceAll("\\D+","");
        int integer = Integer.parseInt(string);
        return integer;
    }
}
