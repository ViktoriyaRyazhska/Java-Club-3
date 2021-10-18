package andrii_yaremko;

import java.util.Scanner;

public class Task29 {
    public String enough(String scan){
        switch (scan) {
            case "1": {
                System.out.println("One");
                return "One";
            }
            case "2": {
                System.out.println("Two");
                return "Two";
            }
            case "3": {
                System.out.println("Three");
                return "Three";
            }

            case "4": {
                System.out.println("For");
                return "For";
            }

            case "5": {
                System.out.println("Five");
                return "Five";
            }

            case "6": {
                System.out.println("Six");
                return "Six";
            }

            case "7": {
                System.out.println("Seven");
                return "Seven";
            }

            case "8": {
                System.out.println("Eigth");
                return "Eigth";
            }

            case "9": {
                System.out.println("Nine");
                return "Nine";
            }

            case "10": {
                System.out.println("Ten");
                return "Ten";
            }

        }
        return "Numbers";
    }
}
