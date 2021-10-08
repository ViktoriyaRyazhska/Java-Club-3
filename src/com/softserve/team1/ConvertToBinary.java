import java.util.Scanner;

public class ConvertToBinary {
    public static int toBinary(int n) {
        return n > 1 ? toBinary(n / 2) * 10 + n % 2 : n;
    }

    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if(number < 0) number *= -1;

        System.out.println(number + " in binary system is: " + toBinary(number));
    }
}
