package andrii_yaremko;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task41 {
    public String fixTheMeerkat(String a,String b,String c){
        String[] arr = { a, b, c };
        System.out.println(Arrays.deepToString(arr));
                String[] array = new String[3];
                array[0] = arr[1];
                array[1] = arr[0];
                array[2] = arr[2];
                System.out.println(Arrays.deepToString(array));
                return Arrays.deepToString(array);
        }
    }

