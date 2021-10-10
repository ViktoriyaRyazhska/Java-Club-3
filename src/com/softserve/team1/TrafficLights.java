import java.util.Locale;
import java.util.Scanner;

public class TrafficLights {
    public static String updateLight(String current) {
        String nextState = "";
        switch(current) {
            case "red":
                nextState = "yellow";
            break;
            case "yellow":
                nextState = "green";
            break;
            case "green":
                nextState = "red";
            break;
            default:
                nextState = "undefined";
            break;
        }
        return nextState;
    }

    public static void main(String[] args) {
        System.out.println("Enter current light [red | yellow | green]: ");
        Scanner in = new Scanner(System.in);

        String currentLight = in.nextLine();
        currentLight = currentLight.toLowerCase(Locale.ROOT);

        System.out.println("Next light is " + updateLight(currentLight));
    }
}
