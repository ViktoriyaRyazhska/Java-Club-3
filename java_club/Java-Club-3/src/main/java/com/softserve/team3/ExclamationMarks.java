package com.softserve.team3;

public class ExclamationMarks {
    public static String remove(String s, int n){
        while(n-->0)
            s  = s.replaceFirst("!","");
        return s;
    }
}
