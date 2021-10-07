package com.softserve.team1;

public class FixmeStaticElectrickery {
    private static int ONE_HUNDRED = 100;
    public static final FixmeStaticElectrickery INST = new FixmeStaticElectrickery();
    private int value;

    private FixmeStaticElectrickery() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }
}
