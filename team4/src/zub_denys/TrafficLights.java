package zub_denys;

import java.util.Locale;
import java.util.Scanner;

public class TrafficLights {

    public static String updateLight(String current) {
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

    public static void main(String[] args) {
        System.out.println("Enter color: ");
        Scanner sc = new Scanner(System.in);
        String color = sc.next();
        color = color.toLowerCase(Locale.ROOT);

        System.out.println(updateLight(color));

//    System.out.println(updateLight());
//    System.out.println(updateLight("green"));
    }
}