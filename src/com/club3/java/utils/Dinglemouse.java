package com.club3.java.utils;

public class Dinglemouse {

    private static int ONE_HUNDRED = 100;

    public static final Dinglemouse INST = new Dinglemouse();

    private final int value;

    public Dinglemouse() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }
}
