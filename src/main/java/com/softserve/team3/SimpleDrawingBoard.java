package team3.main.java.romanS.appParts;

import java.util.Scanner;

public class SimpleDrawingBoard {
    public static void simpleDrawingBoard (){
        char[][] canvas = createCanvas ();
        drawCanvas (canvas);
        int [] coords = readCoordinates();
        canvas = drawRectangle (canvas, coords);
        drawCanvas (canvas);
    }
    private static char[][] createCanvas () {
        int minValue = 0;
        int maxValue = 1000;
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Input horizontal size of canvas.");
        int canvaSizeA = scanner.nextInt();
        canvaSizeA = checkInput(canvaSizeA, minValue, maxValue);
        System.out.println ("Input vertical size of canvas.");
        int canvaSizeB = scanner.nextInt();
        canvaSizeB = checkInput(canvaSizeB, minValue, maxValue);
        char[][] drawingBoard = new char[canvaSizeA][canvaSizeB];
        for (int y = 0; y < drawingBoard.length; y++) {
            for (int x = 0; x < drawingBoard[y].length; x++) {
                drawingBoard[y][x] = ' ';
            }
        }
        return drawingBoard;
    }

    private static int checkInput(int intToCheck, int minValue, int maxValue) {
        Scanner scanner = new Scanner(System.in);
        while (intToCheck > maxValue || intToCheck < minValue) {
            System.out.println("One of values has wrong value please input new .");
            intToCheck = scanner.nextInt();
        }
        return intToCheck;
    }

    private static int [] readCoordinates () {
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Input a and b coordinates of first point in format x1 y1 x2 y2");
        String objectCoordStr1 = scanner.nextLine();
        String[] objectCoordinates1 = objectCoordStr1.split(" ");
        int [] coordinateArray = new int [objectCoordinates1.length];
        for(int i=0; i< objectCoordinates1.length; i++) {
            coordinateArray[i] = Integer.parseInt(objectCoordinates1[i]);
        }
        return coordinateArray;
    }
    private static void drawCanvas (char[][] canvas) {
        System.out.println ("Printing canvas.");
        printHorizontalLine (canvas);
        for (int y = 0; y < canvas.length; y++) {
            System.out.print("|");
            for (int x = 0; x < canvas[y].length; x++) {
                System.out.print(canvas[y][x]);
            }
            System.out.print("|");
            System.out.println ();
        }
        printHorizontalLine (canvas);
    }
    private static void printHorizontalLine(char[][] canvas) {
        for (int a = 0; a < canvas[0].length + 2; a++) {
            System.out.print("-");
        }
        System.out.println ();
    }

    private static char[][] drawRectangle (char[][] canvas, int [] coords) {
        for (int y = coords[1]; y < coords[3]; y++) {
            for (int x = coords[0]; x < coords[2]; x++) {
                canvas[y][x] = 'x';
            }
        }
        for (int y = coords[1]+1; y < coords[3]-1; y++) {
            for (int x = coords[0]+1; x < coords[2]-1; x++) {
                canvas[y][x] = 'o';
            }
        }
        return canvas;
    }
}

