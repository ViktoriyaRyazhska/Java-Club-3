package andrii_yaremko;

import java.util.Arrays;
import java.util.Scanner;

public class Task37 {
    public void reverse(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int a = scanner.nextInt();
        int [] array = new int[a];
        for(int i = 0; a > 0; i++) {
            array[i] = a;
            a--;
        }
        System.out.println(Arrays.toString(array));
    }
}
