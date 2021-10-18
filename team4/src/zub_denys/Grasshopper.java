package zub_denys;

import java.util.Scanner;

public class Grasshopper {
    public static String weatherInfo(int temp) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter temperature in fahrenheit: ");
//        int temp  = sc.nextInt();

        double c = (temp - 32) * 5/9.0;
        if (c < 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }
}

