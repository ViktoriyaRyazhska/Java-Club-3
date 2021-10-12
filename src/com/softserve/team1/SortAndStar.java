package com.softserve.team1;

import java.util.Arrays;

public class SortAndStar {
    public static String twoSort(String[] s) {
        Arrays.sort(s);
        return String.join("***", s[0].split(""));
//        Character firstStrChar, secondStrChar;
//        String temp;
//        for (int j = 0; j < s.length - 1; j++) {
//            for (int k = j + 1; k < s.length; k++) {
//                firstStrChar = s[j].charAt(0);
//                secondStrChar = s[k].charAt(0);
//                if (firstStrChar.hashCode() > secondStrChar.hashCode()) {
//                    temp = s[j];
//                    s[j] = s[k];
//                    s[k] = temp;
//                }
//            }
//        }
//
//
//        String[] s1 = new String[s.length];
//        StringBuilder sb1 = new StringBuilder();
//
//        for (int i = 0; i < s.length; i++) {
//            for (int j = 0; j < s[i].length(); j++) {
//                sb1.append(s[i].charAt(j) + "***");
//            }
//            s1[i] = sb1.toString();
//            sb1.setLength(0);
//        }
//
//        sb1.append(String.join("", s1));
//        sb1.setLength(sb1.length() - 3);
//        return sb1.toString().split("",);
    }
}
