package zub_denys;

import java.util.Locale;
import java.util.Scanner;

public class TrafficLights {

    public static String updateLight() {
        System.out.println("Enter color: ");
        Scanner sc = new Scanner(System.in);
        String color = sc.next();
        color = color.toLowerCase(Locale.ROOT);
        String current = color;
        String next = "";
        switch (current) {
            case "green":
                next = "yellow";
            break;
            case "yellow":
                next = "red";
            break;
            case "red":
                next =  "green";
            break;
            default:
                next = "wrong color";
            break;
        }
        return next;
    }
}