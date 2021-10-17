package team3.main.java.romanS.appParts;

import java.util.Scanner;

public class WillThereBeEnoughSpace {
    public static void willThereBeEnoughSpace () {
        System.out.println ("Searching how really good is grade");
        inputSpace();
    }
    private static void inputSpace () {
        int minvalue = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Input number of places in bus");
        int placesInBus = scanner.nextInt();
        placesInBus = checkInput(placesInBus, minvalue);
        System.out.println ("Input number of people in bus already");
        int peopleInBus = scanner.nextInt();
//        peopleInBus = checkInput(peopleInBus, minvalue, placesInBus);
        System.out.println ("Input number of people waiting on bus stop");
        int peopleOnStop = scanner.nextInt();
//        peopleOnStop = checkInput(peopleOnStop, minvalue);
        checkPeopleCount (placesInBus, peopleInBus, peopleOnStop);
    }
    private static void checkPeopleCount (int placesInBus, int peopleInBus, int peopleOnStop) {
        int placesLeft = placesInBus - (peopleInBus + peopleOnStop);
        if (placesLeft > 0)
            System.out.println("Bus can take all people from stop, also " + placesLeft + " more can fit.");
        else if (placesLeft < 0)
            System.out.println("Bus can not take all people from stop, also " + placesLeft*(-1) + " will be left on stop.");
        else if (placesLeft == 0)
            System.out.println("Bus can take all people from stop, with " + placesLeft*(-1) + " transport capacity.");
        else
            System.out.println("Something went wrong.");
    }
    private static int checkInput (int intToCheck, int minValue) {
        Scanner scanner = new Scanner(System.in);
        while (intToCheck < minValue) {
            System.out.println("One of values has wrong value please input new .");
            intToCheck = scanner.nextInt();
        }
        return intToCheck;
    }
    private static int checkInput (int intToCheck, int maxValue, int minValue) {
        Scanner scanner = new Scanner(System.in);
        while (intToCheck > maxValue || intToCheck < minValue) {
            System.out.println("One of values has wrong value please input new .");
            intToCheck = scanner.nextInt();
        }
        return intToCheck;
    }
}
