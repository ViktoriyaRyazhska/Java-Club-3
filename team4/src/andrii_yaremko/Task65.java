package andrii_yaremko;

import java.util.Scanner;

public class Task65 {
    public void abbrevName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eneter Name and secondName");
        String name = scanner.nextLine();
        System.out.println((name.charAt(0) + "." + (name.charAt(name.indexOf(" ")+1))).toUpperCase());
    }
}
