package com.club3.java.impl;

public class BasicProgramImpl {

    public double getVolumeOfCuboid3(double lengs, double width, double height) {
        return lengs * width * height;
    }

    public int past7(int hours, int min, int sec) {
        int res = 0;
        if (hours <= 23 && hours >= 0) {
            if (min <= 59 && min >= 0) {
                if (sec >= 0) {
                    res = ((hours * 3600) + (min * 60) + (sec)) * 1000;
                }
            }
        }
        return res;
    }

    public String weatherInfo11(int far) {
        double cels = 0;
        cels = ((far - 32) * (5.0 / 9.0));
        if (cels > 0) {
            return cels + " is above freezing temperature";
        } else {
            return cels + " is freezing temperature";
        }
    }

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

    public int doubleInteger(int i) {
        return i * 2;
    }

    public String greet(String name) {
        if (!name.isEmpty()) {
            if (name.equals("Johnny"))
                return "Hello, my love!";
            else
                return String.format("Hello, %s!", name);
        }
        return "name is null";
    }

    public int makeNegative(final int x) {
        return (x < 0) ? x : -x;
    }
}
