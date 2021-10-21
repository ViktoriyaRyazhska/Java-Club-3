package com.softserve.Java_club_team_5;


import com.softserve.Java_club_team_5.oop.BasicSubclassesAdamAndEve;
import com.softserve.Java_club_team_5.two_fighters_one_winner.FighterService;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    static Scanner scan = new Scanner(System.in);
    static BasicProgramming bp=new BasicProgramming();
    static Conditions cond = new Conditions();
    static Loops loop = new Loops();
    static Encryption enc = new Encryption();
    static StringManagement stm = new StringManagement();
    static Dictionary dict = new Dictionary();
    static Collections col=new Collections();
    static FighterService fighterService = new FighterService();
    static HowGoodAreYouReally howgood=new HowGoodAreYouReally();



    public static void main(String[] args) {
        int num;
        char ch;

        do {
            System.out.println("Chose category:\r\n a)Basic Programming \n" +
                    " b)Conditions \n" +
                    " c)Loops \n" +
                    " d)OOP\n" +
                    " e)String\n" +
                    " f)Classes\n" +
                    " g)Collections\n" +
                    " q)Quit");
            ch = scan.next().charAt(0);

            switch (ch) {
                case 'a':
                    System.out.println("Chose category:\r\n 1)Kata 1 \n" +
                            " 2)Kata 2 \n" +
                            " 3)Kata 3 \n" +
                            " 4)Kata 4\n" +
                            " 5)Kata 5\n" +
                            " 6)Kata 6\n" +
                            " 7)Kata 7\n" +
                            " 8)Kata 8\n" +
                            " 9)Kata 9\n" +
                            " 10)Kata 10\n" +
                            " 11)Kata 11\n" +
                            " 0)Back\n" );
                    do {
                        num = scan.nextInt();
                        int i;
                        switch (num) {
                            case 1:
                                    System.out.println("Insert your number");
                                    System.out.println("Your number is doubled: "+bp.doubleInteger(scan.nextInt()));
                            break;
                            case 2:
                                System.out.println("Insert number you want to be multiplied: ");
                                System.out.println("Multiplication result: "+bp.multiply(scan.nextInt(),scan.nextInt()));
                            break;
                            case 3:
                                System.out.println("Define length, width and height of your cuboid:");
                                i=(int) bp.getVolumeOfCuboid(scan.nextDouble(),scan.nextDouble(),scan.nextDouble());
                                System.out.println("Volume of your cuboid equals to:"+i);
                            break;
                            case 4:
                                System.out.println("Insert wall length and size of a pixel: ");
                                System.out.println("Will your pixels fit to the wall: "+bp.isDivisible(scan.nextInt(),scan.nextInt()));
                            break;
                            case 5:
                                System.out.println("Insert a name: ");
                                System.out.println(bp.greet(scan.next()));
                            break;
                            case 6:
                                System.out.println("Insert a number you want to convert to binary: ");
                                System.out.println("Your number is: "+bp.toBinary(scan.nextInt()));
                            break;
                            case 7:
                                System.out.println("Insert hours, minutes and seconds :");
                                System.out.println("Your past time is: "+bp.past(scan.nextInt(),scan.nextInt(),scan.nextInt()));
                            break;
                            case 8:
                                System.out.println("Insert a year: ");
                                System.out.println("This year belong to "+bp.century(scan.nextInt())+" century");
                            break;
                            case 9:
                                System.out.println("Insert a number :");
                                System.out.println("Your negative number is: "+bp.makeNegative(scan.nextInt()));
                            break;
                            case 10:
                                System.out.println("Enter an age: ");
                                System.out.println("Your dating range: "+bp.datingRange(scan.nextInt()));
                            break;
                            case 11:
                                System.out.println("Enter a temperature in Fahrenheit: ");
                                System.out.println("Your temp in Celsius "+bp.weatherInfo(scan.nextInt()));
                            break;
                        }

                    } while (num != 0);
                break;


                case 'b':
                    System.out.println("Chose operation:\r\n 1)Opposite Number\n" +
                            " 2)Is n divisible by x and y\n" +
                            " 3)Convert boolean to string\n" +
                            " 4)Bonuses\n" +
                            " 5)Calculate age\n" +
                            " 6)Rock paper scissors\n" +
                            " 7)Calculator\n" +
                            " 8)Loves, loves me not\n" +
                            " 0)Back\n" );
                    do {
                        num = scan.nextInt();
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
                            case 5:
                                System.out.println("Enter your birth year and random year:");
                                System.out.println(cond.CalculateAge(scan.nextInt(),scan.nextInt()));
                            break;
                            case 6:
                                System.out.println("Rock, Paper, Scissors! Enter player 1 choice: ");
                                String s1=scan.next();
                                System.out.println("Enter player 2 choice: ");
                                String s2=scan.next();
                                System.out.println(cond.rps(s1,s2));
                                s1=null;
                                s2=null;
                                System.gc();
                            break;
                            case 7:
                                System.out.println("Chose your operation (+,-,/,*) :");
                                s1=scan.next();
                                System.out.println("Enter two values: ");
                                System.out.println(cond.basicMath(s1,scan.nextInt(),scan.nextInt()));
                                s1=null;
                                System.gc();
                            break;
                            case 8:
                                System.out.println("Enter a number of flower petals: ");
                                System.out.println("Loves: "+cond.isLove(scan.nextInt(),scan.nextInt()));
                            break;
                            case 9:
                                System.out.println("Enter capacity, amount of passengers on board, passengers who`re waiting :");
                                System.out.println(WillBeThereEnoughSpace.checkFreePlaces(scan.nextInt(),scan.nextInt(),scan.nextInt()));
                            break;
                            case 10:
                                System.out.println("Enter boolean which you want to be transformed into String: ");
                                System.out.println(BooleanValueToString.boolToWord(scan.nextBoolean()));
                            break;
                            case 11:
                                System.out.println("Enter number to be switched up: ");
                                System.out.println(SwitchItUp.convert(scan.nextInt()));
                            break;
                            case 12:
                                System.out.println(TheModulo3Sequence.modulo());
                            break;
                        }
                    } while (num != 0);
                    break;

                case 'c':
                    System.out.println("Chose operation:\r\n 1)String repeater\n" +
                            " 2)Cat and Dog years\n" +
                            " 3)Mean value of an array\n" +
                            " 4)Array map\n" +
                            " 5)Count Sheeps\n" +
                            " 6)Reverse array\n" +
                            " 0)Back\n" );
                    do {
                        num = scan.nextInt();
                        switch (num) {
                            case 1:
                                System.out.println("Enter a number of repetitions and String value: ");
                                System.out.println(loop.repeatString(scan.nextInt(), scan.next()));
                            break;
                            case 2:
                                System.out.println("Enter a number of human years: ");
                                System.out.println(loop.catDogYears(scan.nextInt()));
                            break;
                            case 3:
                                loop.mean(arrayInput(scan.nextInt()));
                            break;
                            case 4:
                                System.out.println("Insert and array: ");
                                System.out.println("Your map :"+Arrays.toString(loop.map(arrayInput(scan.nextInt()))));
                            break;
                            case 5:
                                System.out.println("Enter the size of your array, and true/false elements: ");
                                System.out.println(loop.countSheeps(arrayInputBool(scan.nextInt())));
                            break;
                            case 6:
                                System.out.println("Enter a size of your array:");
                                System.out.println("Your array: "+ Arrays.toString(loop.reverse(scan.nextInt())));
                            break;
                            case 7:
                                System.out.println("Enter your mark: ");
                                System.out.println("Is your mark higher than average: "+howgood.checkIsYouBetter(scan.nextInt()));
                            break;
                            case 8:
                                System.out.println("Enter a value to calculate Growth: ");
                                System.out.println("Growth rate: "+BeginnerReduceButGrow.calculateGrow(scan.nextInt()));
                            break;
                            case 9:
                                System.out.println("Enter an array of values: ");
                                System.out.println("Sum of array values: "+SumOfPositive.sum(arrayInput(scan.nextInt())));
                            break;
                        }
                    } while (num != 0);
                    break;
                case 'd':
                    do {
                        num = scan.nextInt();
                        switch (num) {
                            case 1:
                                System.out.println(Arrays.toString(BasicSubclassesAdamAndEve.createHumans()));
                             break;
                            case 3:
                                System.out.println(enc.encode(scan.next()));
                                break;
                        }
                    } while (num != 0);
                    break;

                case 'e':
                    do {
                        num = scan.nextInt();
                        switch (num) {
                            case 1:
                                System.out.println(stm.strTransform(scan.nextInt()));
                                break;
                            case 2:
                                stm.strReverse(scan.next());
                                break;
                            case 3:
                                stm.sayHello(arrayInputStr(), scan.next());
                                break;
                            case 4:
                                stm.strOpposite(scan.next());
                                break;
                            case 5:
                                System.out.println("Insert your String including dots: ");
                                System.out.println("Output String: "+stm.replaceDots(scan.next()));
                            break;
                            case 6:
                                System.out.println("Enter your name: ");
                                System.out.println(stm.areYouPlayingBanjo(scan.next()));
                            break;
                            case 7:
                                System.out.println("Enter String: ");
                                System.out.println(stm.noSpace(scan.next()));
                            break;
                            case 8:
                                System.out.println("Enter three strings: ");
                                System.out.println("Result is: "+stm.tripleTrouble(scan.next(),scan.next(),scan.next()));
                            break;
                            case  9:
                                System.out.println("Enter a String of numbers: ");
                                System.out.println("Fake binary: "+FakeBinary.convert(scan.next()));
                            break;
                        }
                    } while (num != 0);
                    break;
                case 'g':
                    System.out.println("Chose operation:\r\n 1)...\n" +
                            " 2)Array List Creation\n" +
                            " 3)....\n" +
                            " 4)Dictionary\n" +
                            " 0)Back");
                    do {
                        num = scan.nextInt();
                        switch (num) {
                            case 2:
                                System.out.println("Enter a size of array: ");
                                System.out.println("Output array: "+col.CreateList(scan.nextInt()));
                            break;
                            case 4:
                                dict.operate();
                            break;

                        }
                    } while (num != 0);
                    break;
                default:
                    System.out.println("Application stopped working");
                    System.gc();
                break;
            }
        } while (ch != 'q');

    }


    //arrays inout methods
    public static int[] arrayInput(int size) {
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        return (arr);

    }

    public static String[] arrayInputStr() {
        String arr[] = new String[2];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.next();
        }
        return (arr);
    }
    public static Boolean[] arrayInputBool(int size) {
        Boolean arr[] = new Boolean[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextBoolean();
        }
        return arr;
    }
}
