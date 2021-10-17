package andrii_yaremko;

import java.util.Arrays;
import java.util.Scanner;

public class Task37 {
    public String reverse(int a){

        int [] array = new int[a];
        for(int i = 0; a > 0; i++) {
            array[i] = a;
            a--;
        }
        System.out.println(Arrays.toString(array));
        return Arrays.toString(array);
    }
}
