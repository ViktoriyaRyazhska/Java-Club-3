package com.club3.java;

import java.util.Arrays;
import java.util.Scanner;

public class Conditions {


    public String divinity19() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n,x,y");
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (n % x == 0 && n % y == 0)
        {
            return "n = " + n + " is divisible on " + "x = " + x + " y = " + y;
        }else
        if (n % x == 0 && n % y != 0)
        {
            return "n = " + n + " is divisible on " + "x = " + x + " but not on y = " + y;
        }else
        if (n % x != 0 && n % y == 0)
        {
            return "n = " + n + " not divisible on " + "x = " + x + " but divisible on y = " + y;
        }
        else
        if (n % x != 0 && n % y != 0)
        {
            return "n = " + n + " not divisible on " + "x = " + x + " y = " + y;
        }
        return "Some problems";

    }

    public String rps23() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter for 1 player paper or scissors or rock");
        String p1 = scanner.nextLine();
        System.out.println("Enter for 2 player paper or scissors or rock");
        String p2 = scanner.nextLine();
        String p = "paper";
        String s = "scissors";
        String r = "rock";


        if(p1.equals(s) && p2.equals(p)  || p1.equals(r) && p2.equals(s) || p1.equals(p) && p2.equals(r))
        {
            return "Player 1 won!";
        }else
        if (p2.equals(s) && p1.equals(p) || p2.equals(r) && p1.equals(s) || p2.equals(p) && p1.equals(r))
        {
            return "Player 2 won!";
        }else
        if (p1.equals(p2))
        {
            return "Draw!";
        }
        return "Ups!";
    }

    public int enough27(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cap,on,wait");

        int cap = scanner.nextInt();
        int on = scanner.nextInt();
        int wait = scanner.nextInt();

        int sum = 0;
        sum = on + wait;

        if (cap >= sum)
        {
            System.out.print("Enoughth plase empty : ");
            return cap - sum;
        }else
        if(cap - sum < 0)
        {
            System.out.print("Not enoughth plase on : ");
            return Math.abs(cap - sum);
        }
        return 000;
    }

    public void rentalCarCost31() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter for how many days ");
        int d = scanner.nextInt();

        int coast = 0;
        int days = 1;
        if (d<3 && d>0)
        {
            for (int i = 0; i<d ; i++)
            {
                coast += 40;
                System.out.println("day: "+ days +" prise :"+coast);
                days++;
            }
        }else
        if (d<7 && d>=3)
        {
            for (int i = 0; i<d ; i++)
            {
                coast += 40;
                if (i == 2)
                {
                    coast -=20;
                }
                System.out.println("day: "+ days +" prise :"+coast);
                days++;
            }
        }
        if (d>=7)
        {
            for (int i = 0; i<d ; i++)
            {
                coast += 40;
                if (i == 2)
                {
                    coast -=20;
                }
                if (i == 6)
                {
                    coast -=30;
                }
                System.out.println("day: "+ days +" prise :"+coast);
                days++;
            }
        }
    }





}
