package com.softserve.team1.kata.impl;

public class FixmeStaticElectrickery extends BaseKata{
    private static int ONE_HUNDRED = 100;
    public static final FixmeStaticElectrickery INST = new FixmeStaticElectrickery();
    private int value;

    private FixmeStaticElectrickery() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }

    @Override
    public void test() {
        System.out.println(FixmeStaticElectrickery.INST.plus100(23));
    }
}
