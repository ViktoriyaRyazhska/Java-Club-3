package andrii_yaremko;

import java.util.Scanner;

public class Task57 {
    public void noSpace() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words");
          String x = scanner.nextLine();
        System.out.println(x.replaceAll("\\s",""));
    }
}
