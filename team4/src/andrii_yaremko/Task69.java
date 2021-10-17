package andrii_yaremko;

import java.util.Scanner;

public class Task69 {
    public String toAlternativeString(String string) {
        StringBuilder sb = new StringBuilder(string);

        for(int i = 0; i < string.length(); i++){

            if(Character.isLowerCase(string.charAt(i))){
                sb.setCharAt(i, Character.toUpperCase(string.charAt(i)));
            }
            if(Character.isUpperCase(string.charAt(i))){
                sb.setCharAt(i, Character.toLowerCase(string.charAt(i)));
            }
        }
        String g = sb.toString();
        System.out.println(g);
        return g;
    }
}
