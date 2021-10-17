package andrii_yaremko;

import java.util.Scanner;

public class Task53 {
    public void sayHello() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.next();
        System.out.println("Enter city");
        String city = scanner.next();
        System.out.println("Enter state");
        String state = scanner.next();
        String halo = String.format("Hello, %1$s! Welcome to %2$s, %3$s!", String.join(" ", name), city, state);
        System.out.println(halo);
    }
}
