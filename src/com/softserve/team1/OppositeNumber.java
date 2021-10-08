import java.util.Scanner;

public class OppositeNumber {
    public static int opposite(int number) {
        return -number;
    }

    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        System.out.println(number + ": " + opposite(number));
    }
}
