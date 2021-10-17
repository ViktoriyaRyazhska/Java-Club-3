package team3.main.java.romanS.appParts;

import java.util.Scanner;

public class WelcomeToTheCity {
    public static void welcomeToTheCity () {
        System.out.println ("Running Welcome to the city.");
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Input name.");
        String nameString = scanner.nextLine();
        String [] name = nameString.split(" ");
        System.out.println ("Input city.");
        String city = scanner.nextLine();
        System.out.println ("Input country.");
        String country = scanner.nextLine();
        sayHello(name, city, country);
    }
    public static void sayHello (String [] name, String city, String country) {
        System.out.print ("Hello, ");
        for (String names: name) {
            System.out.print (names);
        }
        System.out.print ("!");
        System.out.print ("Welcome to " + city + ", " + country + " !");
        System.out.println ("");
    }
}
