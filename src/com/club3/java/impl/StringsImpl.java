package com.club3.java.impl;

public class StringsImpl {
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
