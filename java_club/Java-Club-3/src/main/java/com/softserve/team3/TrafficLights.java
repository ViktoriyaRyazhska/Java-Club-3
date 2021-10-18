package com.softserve.team3;

public class TrafficLights {
    public static String updateLight(String current) {

        return current == "green" ? "yellow":current == "yellow" ? "red":current == "red" ? "green":"";
    }
}
