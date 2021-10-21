package com.softserve.Java_club_team_5;

public class TheModulo3Sequence {

    public static String modulo() {
        int value1 = 0;
        int value2 = 1;
        int border = (int) Math.pow(10,9);
        int result=0;
        for (int i = 0; value2 < border; i++){
            result = value1 + value2;
            System.out.println("sequence(" + i + ");\n" + result);
            value1 = value2;
            value2 = result;
        }
        return String.valueOf(result);
    }
}
