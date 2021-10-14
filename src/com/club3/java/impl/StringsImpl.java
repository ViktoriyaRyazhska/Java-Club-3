package com.club3.java.impl;

import java.util.Scanner;

public class StringsImpl {

    public String numberToString51(int num) {
        return String.valueOf(num);
    }

   public String replaceDots55(String s1) {
        return s1.replaceAll("\\.", "-");
    }

    public String position59(char alphabet) {
        int position = 0;
        char[] abc_arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (int i = 0; i < abc_arr.length; i++) {
            position++;
            if (alphabet == abc_arr[i]) {
                return "Position of alphabet: " + String.valueOf(position);
            }

        }
        return "Ups!";
    }

   public String abbrevName63(String name) {
        String upper = name.toUpperCase();
        if (name.contains(" ")) {
            return String.valueOf(upper.charAt(0)) + "." + String.valueOf(upper.charAt(upper.indexOf(' ') + 1));
        }
        return "";
    }

    public String toAlternativeString67(String string) {
        String string2 = "";
        System.out.println(string);
        for (int i = 0; i < string.length(); i++) {
            if (Character.toUpperCase(string.charAt(i)) == string.charAt(i)) {
                string2 += Character.toLowerCase(string.charAt(i));
            } else {
                string2 += Character.toUpperCase(string.charAt(i));
            }
        }
        return string2;
    }
    public String correctMistakesOfCharacter(String s) {
        return s.replace("5", "S").replace("0", "O").replace("1", "I");
    }

    public String tripleTrouble(String one, String two, String three) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < one.length(); i++) {
            s.append("").append(one.charAt(i)).append(two.charAt(i)).append(three.charAt(i));
        }
        return s.toString();
    }
}
