package zub_denys;

import java.util.Locale;
import java.util.Scanner;

public class Sticks {
    public static int makeMove(int sticks) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter count of sticks: ");
//        int sticks = sc.nextInt();

        System.out.print("\nResult is ");
        return  sticks % 4;
    }
}