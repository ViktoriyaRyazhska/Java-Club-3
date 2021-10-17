package team3.main.java.romanS.appParts;

import team3.main.java.romanS.appParts.areaCalculations.Circle;
import team3.main.java.romanS.appParts.areaCalculations.Shape;
import team3.main.java.romanS.appParts.areaCalculations.Square;

import java.util.Scanner;

// Also demonstration of area calculations
public class PushAnObjectIntoArray {
    public static void pushAnObjectIntoArray () {
        System.out.println ("Pushing object into array.");
        Shape shapes [] = readInput();
        appOutput (shapes);
    }
    private static Shape [] readInput () {
        Shape shapes [] = new Shape [2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input square side length and circle radius.");
        int squareSide = scanner.nextInt();
        squareSide = checkInput(squareSide, 0);
        shapes [0] = new Square(squareSide);
        shapes [1] = new Circle(squareSide);
        return shapes;
    }
    private static void appOutput (Shape [] shapes) {
        for (Shape shape: shapes) {
            System.out.println("Shape total area is " + shape.GetTotalArea());
        }
    }
    private static int checkInput (int intToCheck, int minValue) {
        Scanner scanner = new Scanner(System.in);
        while (intToCheck < minValue) {
            System.out.println("One of values has wrong value please input new .");
            intToCheck = scanner.nextInt();
        }
        return intToCheck;
    }
}
