package com.softserve.team1.kata.impl;

import com.softserve.team1.kata.Kata;

import java.util.Scanner;

public abstract class BaseKata implements Kata {

    protected Scanner scanner;

    public BaseKata() {
        this.scanner = new Scanner(System.in);
    }
}
