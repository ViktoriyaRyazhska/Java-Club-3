package com.club3.java.impl;

public class ConditionsImpl {

    public int oppositeNumber(int number) {
        int oppositeNumber = 0;
        if (number > 0) {
            oppositeNumber = -number;
        }
        return oppositeNumber;
    }

    public String howOldWillIBeIn2099(int birth, int yearIn) {
        if (birth < yearIn) {
            return "You are " + (yearIn - birth) + " years old.";
        } else if (birth > yearIn) {
            return "You will be born in " + (birth - yearIn) + " years.";
        } else {
            return "You were born this very year!";
        }
    }

    public String convertBooleanValuesToStrings(String s) {
        if (s.equals("false")) {
            return "No";
        } else if (s.equals("true")) {
            return "Yes";
        } else {
            return "Please, write 'true' or 'false'";
        }
    }

    public String trafficLight(String s) {
        if (s.equals("green")) {
            return "yellow";
        } else if (s.equals("yellow")) {
            return "red";
        } else {
            return "green";
        }
    }
}
