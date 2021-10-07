package exercies.basic_program.task_02;

import java.util.Scanner;

public class Main {
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        System.out.println("Enter first number: ");
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        System.out.println("Enter second number: ");

        int num2 = in.nextInt();

        System.out.println("Multiplication of " + num1 + " and " + num2 + " is = " + multiply(num1, num2));
    }
}
