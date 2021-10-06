package com.softserve.team1;

public class AbbreviateA2WordsName {
    public static String abbrevName(String name) {
        return (name.charAt(0) + "." + (name.charAt(name.indexOf(" ")+1))).toUpperCase();
    }
}
