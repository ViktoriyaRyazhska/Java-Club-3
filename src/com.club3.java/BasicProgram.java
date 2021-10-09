package com.club3.java;

import java.util.Scanner;

public class BasicProgram {



    public void getVolumeOfCuboid3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length,width,height ");
        double lengs = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        System.out.println(lengs * width * height + " m^3");
    }

    public void past7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter h,m,s ");
        int hours = scanner.nextInt();
        int min = scanner.nextInt();
        int sec = scanner.nextInt();
        int res = 0;
        if (hours <= 23 && hours >= 0) {
            if (min <= 59 && min >= 0) {
                if (sec >= 0) {
                    res = ((hours * 3600) + (min * 60) + (sec)) * 1000;
                }
            }
        }
        System.out.println(res + " ms");
    }

    public String weatherInfo11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter farenheit");
        int far = scanner.nextInt();
        double cels = 0;
        cels = ((far - 32) * (5.0 / 9.0));
        if (cels > 0) {
            return cels + " is above freezing temperature";
        } else {
            return cels + " is freezing temperature";
        }
    }


}
