import java.text.DecimalFormat;
import java.util.Scanner;

public class AgeRangeCompatibilityEquation {

    public static String datingRange(int age) {
        double min, max;

        if(age <= 14) {
            min = age - 0.10 * age;
            max = age + 0.10 * age;
        }else {
            min = age / 2 + 7;
            max = (age - 7) * 2;
        }

        DecimalFormat df = new DecimalFormat("###");
        min = Math.floor(min);
        max = Math.floor(max);
        String response = df.format(min) + " - " + df.format(max);

        return response;
    }

    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner in = new Scanner(System.in);

        int age = in.nextInt();

        String response = "";

        if(age >= 1 && age <= 100) response = datingRange(age);
        else response = "Not valid age";

        System.out.println("Response: " + response);
    }
}
