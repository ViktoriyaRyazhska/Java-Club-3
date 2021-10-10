import java.util.Scanner;

public class TwiceAsOld {

    public static int twiceAsOld(int dadYears, int sonYears) {
        return Math.abs(2 * sonYears - dadYears);
    }

    public static void main(String[] args) {
        System.out.print("Enter dad years: ");
        Scanner in = new Scanner(System.in);

        int dadYears = in.nextInt();

        System.out.print("Enter son years: ");
        int sonYears = in.nextInt();

        System.out.println(twiceAsOld(dadYears, sonYears));
    }
}
