package com.softserve.team3;

public class Banjo {
    public static String areYouPlayingBanjo(String name) {
        return name + (name.toLowerCase().startsWith("r")?" plays banjo":" does not play banjo");
    }
}