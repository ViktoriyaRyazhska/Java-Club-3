package com.softserve.team1;

public class AreYouPlayingBanjo {

    public static String areYouPlayingBanjo(String name) {
        if (name.toUpperCase().startsWith("R")) {
            return name + " plays banjo";
        } else {
            return name + " does not play banjo";
        }
    }
}