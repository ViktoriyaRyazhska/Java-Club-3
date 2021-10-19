package com.softserve.Java_club_team_5;

public class Encryption extends Encoder {
            public String encode(String str){
                if (str.equals("") || str == null){
                    return null;
                }
                str=str.replaceAll("(?i)a","4");
                str = str.replaceAll("(?i)e", "3");
                str = str.replaceAll("(?i)l", "1");
                str = str.replaceAll("(?i)m", "/^^\\\\");
                str = str.replaceAll("(?i)o", "0");
                str = str.replaceAll("(?i)u", "(_)");
                return str;
            }
}
abstract class Encoder{
    public abstract String encode(String str);
}
