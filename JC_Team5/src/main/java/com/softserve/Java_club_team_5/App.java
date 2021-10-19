package com.softserve.Java_club_team_5;


import java.util.Scanner;

public class App
{
    static Scanner scan=new Scanner(System.in);
    static Conditions cond=new Conditions();
    static Loops loop=new Loops();
    static Encryption enc=new Encryption();
    static  StringManagement stm=new StringManagement();
    static  Dictionary dict=new Dictionary();
    public static void main( String[] args )
    {
        int num;
        char ch;

        do{
            System.out.println("Chose category:\r\n a)Basic Programming \n" +
                    " b)Conditions \n" +
                    " c)Loops \n" +
                    " d)OOP\n" +
                    " e)String\n" +
                    " f)Classes\n" +
                    " g)Collections\n" +
                    " q)Quit" );
          ch= scan.next().charAt(0);

        switch (ch){
            case 'a':
            break;

            case 'b':
                System.out.println("Chose operation:\r\n 1)Opposite Number\n" +
                        " 2)Is n divisible by x and y\n" +
                        " 3)Convert boolean to string\n" +
                        " 4)Bonuses\n" +
                        " a)Basic Programming\n" +
                        " 0)Back");
                do {

                    num=scan.nextInt();
                    switch (num) {
                        case 1:
                            cond.returnNegative(scan.nextInt());
                            break;
                        case 2:
                            cond.indivisible(scan.nextInt(), scan.nextInt(), scan.nextInt());
                            break;
                        case 3:
                            cond.convertBool(scan.nextInt());
                            break;
                        case 4:
                            cond.bonuses(scan.nextFloat(), scan.nextBoolean());
                            break;
                    }

                }while (num!=0);
            break;

            case 'c':
                do {
                    num=scan.nextInt();
                    switch (num) {
                        case 1:
                            loop.repeatString(scan.nextInt(),scan.next());
                            break;
                        case 2:
                            loop.catDogYears(scan.nextInt());
                            break;
                        case 3:
                            loop.mean(arrayInput(scan.nextInt()));
                            break;
                    }
                }while (num!=0);
            break;
            case 'd':
                do {
                    num=scan.nextInt();
                    switch (num) {
                        case 3:
                            System.out.println(enc.encode(scan.next()));
                        break;
                    }
                }while (num!=0);
            break;

            case 'e':
                do {
                    num=scan.nextInt();
                    switch (num) {
                        case 1:
                            stm.strTransform(scan.nextInt());
                            break;
                        case 2:
                            stm.strReverse(scan.next());
                            break;
                        case 3:
                            stm.sayHello(arrayInputStr(),scan.next());
                            break;
                        case 4:
                            stm.strOpposite(scan.next());
                            break;
                    }
                }while (num!=0);
            break;
            case 'g':
                System.out.println("Chose operation:\r\n 1)Opposite Number\n" +
                        " 2)Is n divisible by x and y\n" +
                        " 3)Convert boolean to string\n" +
                        " 4)Dictionary\n" +
                        " 0)Back");
                do {
                    num=scan.nextInt();
                    switch (num) {
                        case 4:
                            dict.operate();
                        break;

                    }
                }while (num!=0);
            break;
            default:
                System.out.println("Application stopped working");
            break;
         }
        }while(ch!='q');

    }


    //arrays inout methods
    public static int[] arrayInput(int size){
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        return (arr);

    }
    public static String[] arrayInputStr(){
        String arr[] = new String[2];
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.next();
        }
        return (arr);
    }
}
