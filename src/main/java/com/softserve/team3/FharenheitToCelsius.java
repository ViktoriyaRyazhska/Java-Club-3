package team3.main.java.romanS.appParts;

import java.util.Scanner;

public class FharenheitToCelsius {
    public static void fharenheitToCelsius () {
        System.out.println ("Converting fahrenheit to celsius.");
        inputFahrenheitDegrees();
    }
    private static void inputFahrenheitDegrees (){
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Input Fahrenheit degrees");
        int fahrenheitDegrees = scanner.nextInt();
        System.out.println ("Is decimal accuracy supported? (y/n)");
        char celsiusTenthSupportString = scanner.next().charAt(0);
        if (celsiusTenthSupportString == 'y'){
            double celsiusDegrees = countCelsiusDegreesDouble (fahrenheitDegrees);
            System.out.println ("Temperature in Celsius degrees is " + celsiusDegrees);
        }
        else {
            int celsiusDegrees = countCelsiusDegreesInt (fahrenheitDegrees);
            System.out.println ("Temperature in Celsius degrees rounded is " + celsiusDegrees);
        }
    }
    private static double countCelsiusDegreesDouble (int fahrenheitDegrees) {
        double celsiusDegrees = (fahrenheitDegrees - 32) * 5/9;
        System.out.println ("Accurate temperature in Celsius degrees  is " + celsiusDegrees);
        return celsiusDegrees;
    }
    private static int countCelsiusDegreesInt (int fahrenheitDegrees) {
        int celsiusDegrees = Math.round((fahrenheitDegrees - 32) * 5/9);
        System.out.println ("Approximate temperature in Celsius degrees  is " + celsiusDegrees);
        return celsiusDegrees;
    }
}
