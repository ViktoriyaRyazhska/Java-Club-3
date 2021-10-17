package andrii_yaremko;

import java.util.Scanner;

public class Task6 {
    public void to_binary(){
        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String bin = Integer.toBinaryString(a);
        System.out.println(bin);
    }
}
