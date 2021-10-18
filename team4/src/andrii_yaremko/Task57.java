package andrii_yaremko;

import java.util.Scanner;

public class Task57 {
    public String noSpace(String x) {
        String z = x.replaceAll("\\s","");
        System.out.println(z);
        return z;
    }
}
