package com.softserve.team1;

public class FakeBinary {

    public static String fakeBin(String numberString) {
        String result = "";
        for (int i = 0; i < numberString.length(); i++) {
            if (numberString.charAt(i) < '5') {
                result += '0';
            } else {
                result += '1';
            }
        }
        return result;
    }
}