package andrii_yaremko;

import java.util.Scanner;

public class Task24 {
    public double operations(double a, double b, String operation) {

        if (operation.equals("+")) {
            System.out.println(a + b);
            return a + b;
        } else if (operation.equals("-")) {
            System.out.println(a - b);
            return a - b;
        } else if (operation.equals("*")) {
            System.out.println(a * b);
            return a * b;
        } else if (operation.equals("/")) {
            if (b == 0) {
                System.out.println("cannot be divided by 0");
            } else
                System.out.println(a / b);
        }
        return a / b;
    }
}
