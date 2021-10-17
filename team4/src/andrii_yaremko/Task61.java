package andrii_yaremko;

import java.util.Scanner;

public class Task61 {
    public void position() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter letter");
        String alphabet = scanner.next();
        int a = "abcdefghijklmnopqrstuvwxyz".indexOf(alphabet) + 1;
        System.out.println("Position of alphabet: " + a);
    }
}
