package andrii_yaremko;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task73 {
    public String filterOddNumber(int a,int b,int c,int d,int e) {
        List<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(a);
        listOfNumbers.add(b);
        listOfNumbers.add(c);
        listOfNumbers.add(d);
        listOfNumbers.add(e);
        listOfNumbers.removeIf(i -> i%2 == 0);

        String arr = Arrays.deepToString(new List[]{listOfNumbers});
        System.out.println(listOfNumbers);
        return arr;
    }
}
