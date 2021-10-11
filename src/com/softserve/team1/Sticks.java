import java.util.Scanner;

public class Sticks {
    public static int makeMove(int sticks) {
        return sticks % 4;
    }

    public static void main(String[] args) {
        System.out.print("Enter count of sticks: ");
        Scanner in = new Scanner(System.in);

        int sticksCount = in.nextInt();
        System.out.println("Result is " + makeMove(sticksCount));
    }
}
