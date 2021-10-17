package andrii_yaremko;

import java.util.Scanner;

public class Task53 {
    public String sayHello(String name,String city,String state) {
        String halo = String.format("Hello, %1$s! Welcome to %2$s, %3$s!", String.join(" ", name), city, state);
        System.out.println(halo);
        return halo;
    }
}
