package com.softserve.team1;

public class AlternatingCase {
    public static String toAlternativeString(String string) {
        // your code here!
        StringBuilder sb = new StringBuilder(string);

        for(int i = 0; i < string.length(); i++){

            if(Character.isLowerCase(string.charAt(i))){
                sb.setCharAt(i, Character.toUpperCase(string.charAt(i)));
            }
            if(Character.isUpperCase(string.charAt(i))){
                sb.setCharAt(i, Character.toLowerCase(string.charAt(i)));
            }
        }
        return sb.toString();
    }
}
