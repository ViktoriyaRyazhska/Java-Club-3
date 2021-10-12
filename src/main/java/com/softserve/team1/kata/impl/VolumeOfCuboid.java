package com.softserve.team1.kata.impl;

import java.util.Scanner;

public class VolumeOfCuboid extends BaseKata{
    private int height,length,width;
    private Scanner scanner;

    public static double getVolumeOfCuboid(double length, double width, double height) {
        return length*width*height;
    }

    @Override
    public void test() {
        scanner = new Scanner(System.in);
        System.out.println("Bob needs a fast way to calculate the volume of a cuboid with three values: " +
                "length, width and the height of the cuboid. Write a function to help Bob with this calculation.");


        System.out.println("Provide height");
        if(scanner.hasNextInt()){
            height = scanner.nextInt();
        }
        System.out.println("Provide width");
        if(scanner.hasNextInt()){
            width = scanner.nextInt();
        }
        System.out.println("Provide length");
        if(scanner.hasNextInt()){
            length = scanner.nextInt();
        }
        System.out.println("Result: " + getVolumeOfCuboid(length,width,height));
    }
}
