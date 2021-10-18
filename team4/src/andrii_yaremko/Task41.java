package andrii_yaremko;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task41 {
    public String fixTheMeerkat(){
        Scanner scanner = new Scanner(System.in);
        String[] arr = { "body", "head" , "tail" };
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Enter 1 if you need switch them back");
        switch (scanner.next()){
            case "1":
                String[] array = new String[3];
                array[0] = arr[1];
                array[1] = arr[0];
                array[2] = arr[2];
                System.out.println(Arrays.deepToString(array));
                return Arrays.deepToString(array);
        }
        return "false";
    }
}
