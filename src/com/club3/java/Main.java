package com.club3.java;

import com.club3.java.utils.classes.Calculator;
import com.club3.java.utils.classes.Triangle;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.runApplication();

        Calculator calculator = new Calculator();

        calculator.getTotalArea(new Triangle(7,8));
    }
}