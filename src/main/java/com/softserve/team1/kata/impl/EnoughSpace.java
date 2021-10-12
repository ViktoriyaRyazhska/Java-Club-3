package com.softserve.team1.kata.impl;

import java.util.Scanner;

public class EnoughSpace extends BaseKata{
    private Scanner scanner;

    public EnoughSpace() {
        this.scanner = new Scanner(System.in);
    }

    public static int enough(int cap, int on, int wait){
        return cap >= on + wait ? 0 : on + wait - cap;
    }

    @Override
    public void test() {
        int cap = 0, on = 0, wait = 0;
        System.out.println("Bob is working as a bus driver. " +
                "However, he has become extremely popular amongst the city's residents. " +
                "With so many passengers wanting to get aboard his bus, " +
                "he sometimes has to face the problem of not enough space left on the bus! " +
                "He wants you to write a simple program telling him if he will be able to fit all the passengers.");

        System.out.println("Provide bus capacity: ");
        if(scanner.hasNextInt()){
            cap = scanner.nextInt();
        }
        System.out.println("Provide number of people on bus: ");
        if(scanner.hasNextInt()){
            on = scanner.nextInt();
        }
        System.out.println("Provide a number of people waiting for a bus: ");
        if(scanner.hasNextInt()){
            wait = scanner.nextInt();
        }

        if(enough(cap,on,wait) == 0){
            System.out.println("All on board!");
        }else{
            System.out.println(enough(cap,on,wait) + " passenger(s) left outside(");
        }
    }
}
