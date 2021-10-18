package com.softserve.Java_club_team_5;


import java.util.Scanner;

public class App
{
    static Scanner scan=new Scanner(System.in);
    static Conditions cond=new Conditions();
    static Loops loop=new Loops();
    public static void main( String[] args )
    {
       int num=0;
       do{
       num=scan.nextInt();
        switch(num){
            case 1:
                cond.returnNegative(scan.nextInt());
                break;
            case 2:
                cond.indivisible(scan.nextInt(),scan.nextInt(),scan.nextInt());
                break;
            case 3:
                cond.convertBool(scan.nextInt());
                break;
            case 4:
                cond.bonuses(scan.nextFloat(),scan.nextBoolean());
                break;

            // cases for loops
            case 5:
                loop.repeatString(scan.nextInt(),scan.next());
                break;
            default:
                System.out.println("Application stopped working");
                break;
        }
       }while(num!=00);

    }
}
