package andrii_yaremko;

import java.util.Scanner;

public class Task65 {
    public String abbrevName(String name){
        String ggg = (name.charAt(0) + "." + (name.charAt(name.indexOf(" ")+1))).toUpperCase();
        System.out.println(ggg);
        return ggg;
    }
}
