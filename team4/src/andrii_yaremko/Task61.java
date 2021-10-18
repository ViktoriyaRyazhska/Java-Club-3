package andrii_yaremko;

import java.util.Scanner;

public class Task61 {
    public int position(String alphabet) {
        int a = "abcdefghijklmnopqrstuvwxyz".indexOf(alphabet) + 1;
        System.out.println("Position of alphabet: " + a);
        return a;
    }
}
