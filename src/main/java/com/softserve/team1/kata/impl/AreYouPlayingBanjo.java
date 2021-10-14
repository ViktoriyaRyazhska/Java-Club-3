package com.softserve.team1.kata.impl;

import com.softserve.team1.kata.InputType;

public class AreYouPlayingBanjo extends BaseKata {

    public static String areYouPlayingBanjo(String name) {
        if (name.toUpperCase().startsWith("R")) {
            return name + " plays banjo";
        } else {
            return name + " does not play banjo";
        }
    }

    @Override
    public void test() {
        System.out.println("Enter name : ");
        String inputName = (String) readInput(InputType.STRING);
        System.out.println(areYouPlayingBanjo(inputName));
    }
}
