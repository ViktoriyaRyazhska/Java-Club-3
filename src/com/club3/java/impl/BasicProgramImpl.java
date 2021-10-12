package com.club3.java.impl;

public class BasicProgramImpl {

    public int multiplyTwoNumbers(int one, int two) {
        return one * two;
    }

    public int integerToBinary(int number) {
        String numberToBinary = Integer.toBinaryString(number);
        return Integer.parseInt(numberToBinary);
    }

    public String ageRangeCompatibilityEquation(int age) {
        int min;
        int max;
        if (age <= 14) {
            min = (int) (age - (0.10 * age));
            max = (int) (age + (0.10 * age));
        } else {
            min = age / 2 + 7;
            max = (age - 7) * 2;
        }
        return min + "-" + max;
    }
}
