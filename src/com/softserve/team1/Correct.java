import java.util.Scanner;

public class Correct {
    public static String correct(String string) {
        return string.replaceAll("5","S")
                .replaceAll("0","O")
                .replaceAll("1","I");

    }

    public static void main(String[] args) {
        System.out.println("Enter some string: ");
        Scanner in = new Scanner(System.in);

        String stringExample = in.nextLine();

        System.out.println("Edited string: " + correct(stringExample));
    }
}
