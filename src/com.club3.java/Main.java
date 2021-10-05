package com.club3.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        switch (choice){
            case "1":
                BasicProgram basicProgram = new BasicProgram();
                break;
            case "2":
                Classes classes = new Classes();
                break;
            case "3":
                Conditions conditions = new Conditions();
                break;
            case "4":
                Loops loops = new Loops();
                break;
            case "5":
                OOP oop = new OOP();
                break;
            case "6":
                Strings strings = new Strings();
                break;
            case "7":
                Collections collections = new Collections();
                break;
            default:
                System.out.println("You input incorrect number. Please, try again!");
                break;
        }
    }
}