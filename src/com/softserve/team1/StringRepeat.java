package com.softserve.team1;

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        String result = "";
        for (int i = 0; i < repeat; i++) {
            result = result + string;
        }
        return result;
    }
}
