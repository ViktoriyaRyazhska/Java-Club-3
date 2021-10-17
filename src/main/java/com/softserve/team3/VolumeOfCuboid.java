package team3.main.java.romanS.appParts;

import java.util.Scanner;

public class VolumeOfCuboid {
    public static void volumeOfCuboid() {
        System.out.println ("Finding cuboid volume.");
        inputCuboidStats();
    }
    private static void inputCuboidStats() {
        int cuboidVolume;
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Input cuboid A side");
        int aSide = scanner.nextInt();
        checkInput (aSide);
        System.out.println ("Input cuboid B side");
        int bSide = scanner.nextInt();
        checkInput (bSide);
        System.out.println ("Input cuboid C side");
        int cSide = scanner.nextInt();
        checkInput (cSide);
        cuboidVolume = calculateVolume (aSide, bSide, cSide);
        System.out.println ("Cuboid volume is " + cuboidVolume);
    }
    private static int checkInput (int intToCheck) {
        Scanner scanner = new Scanner(System.in);
        while (intToCheck <= 0) {
            System.out.println("One of sides is less than zero, please rewind your inputs and input new number.");
            intToCheck = scanner.nextInt();
        }
        return intToCheck;
    }
    private static int calculateVolume (int aLength, int bLength, int cLength) {
        int cuboidVolume = aLength * bLength * cLength;
        return cuboidVolume;
    }
}
