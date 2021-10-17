<<<<<<< HEAD
import svyshcho_illya.BasicTask1;
=======
import andrii_yaremko.*;
>>>>>>> 7bc58570a59026c3e2a1b3b33cd145da7790ae49

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu :");
        System.out.println("3) getVolumeOfCubiod\n" +
                "6) to_binary\n"+
                "9) makeNegative\n"+
                "12) addPerson\n"+
                "15) show\n"+
                "18) opposite\n"+
                "21) addSalaryAndBonuses\n"+
                "24) operations\n"+
                "29) enough \n"+
                "33) humanYearsCatYearsDogYears\n"+
                "37) reverse\n"+
                "41) fixTheMeerkat" );

        while (true){
            System.out.println("Enter task's number:");
            switch (sc.next()){
<<<<<<< HEAD
                case "1":{
                    BasicTask1 task = new BasicTask1();
                    task.doubleInteger();
                    System.out.println("READY");

                }
                break;
                case "4":{
                    BasicTask1 task4 = new BasicTask1();
                    task4.isDivisible();
                    System.out.println("READY");

                }
                break;
                case "7":{
                    BasicTask1 task7 = new BasicTask1();
                    task7.Past();
                    System.out.println("READY");

                }
                break;
                case "10":{
                    BasicTask1 task10 = new BasicTask1();
                    task10.datingRange();
                    System.out.println("READY");

                }
                break;
                case "13":{
                    BasicTask1 task13 = new BasicTask1();
                    task13.Dinglemouse();
                    System.out.println("READY");

                }
                break;

                case "16":{
                    BasicTask1 task16 = new BasicTask1();
                    task16.declareWinner();
                    System.out.println("READY");



                }
                break;
                case "19":{
                    BasicTask1 task19 = new BasicTask1();
                    task19.isDivisiblex();
                    System.out.println("READY");

                }
                break;

                case "22":{
                    BasicTask1 task22 = new BasicTask1();
                    task22.CalculateAge();
                    System.out.println("READY");

                }
                break;


                case "25":{
                    BasicTask1 task25 = new BasicTask1();
                    task25.isLove();
                    System.out.println("READY");


                }
                break;
                case "28":{
                    BasicTask1 task28 = new BasicTask1();
                    task28.sequence();
                    System.out.println("READY");


                }
                break;
                case "31":{
                    BasicTask1 task31 = new BasicTask1();
                    task31.rentalCarCost();
                    System.out.println("READY");


                }
                break;
                case "35":{
                    BasicTask1 task35 = new BasicTask1();
                    task35.map();
                    System.out.println("READY");


=======
                case "3":{
                    Task3 task3 = new Task3();
                    task3.getVolumeOfCubiod();
                }
                break;
                case "6":{
                    Task6 task6 = new Task6();
                    task6.to_binary();
                }
                break;
                case "9":{
                    Task9 task9 = new Task9();
                    task9.makeNegative();
                }
                break;
                case "12":{
                    Task12 task12 = new Task12();
                    task12.addPerson();
                }
                case "15": {
                    Task15 task15 = new Task15();
                    task15.show();
                }
                break;
                case "18": {
                    Task18 task18 = new Task18();
                    task18.opposite();
                }
                case "21": {
                    Task21 task21 = new Task21();
                    task21.addSalaryAndBonuses();
                }
                break;
                case "24": {
                    Task24 task24 = new Task24();
                    task24.operations();
                }
                break;
                case "29": {
                    Task29 task29 = new Task29();
                    task29.enough();
                }
                break;
                case "33": {
                    Task33 task339 = new Task33();
                    task339.humanYearsCatYearsDogYears();
                }
                break;
                case "37": {
                    Task37 task37 = new Task37();
                    task37.reverse();
                }
                break;
                case "41": {
                    Task41 task41 = new Task41();
                    task41.fixTheMeerkat();
>>>>>>> 7bc58570a59026c3e2a1b3b33cd145da7790ae49
                }
                break;
                case "39":{
                    BasicTask1 task39 = new BasicTask1();
                    task39.grow();
                    System.out.println("READY");


                }
                break;
                case "43":{
                    BasicTask1 task43 = new BasicTask1();
                    task43.nearestSq();
                    System.out.println("READY");


                }
                break;
                case "47":{
                    BasicTask1 task47 = new BasicTask1();
                    task47.God();
                    System.out.println("READY");


                }
                break;
                case "51":{
                    BasicTask1 task51 = new BasicTask1();
                    task51.numberToString();
                    System.out.println("READY");


                }
                break;
                case "55":{
                    BasicTask1 task55 = new BasicTask1();
                    task55.replaceDots();
                    System.out.println("READY");


                }
                break;
                case "59":{
                    BasicTask1 task59 = new BasicTask1();
                    task59.position();
                    System.out.println("");
                    System.out.println("READY");


                }
                break;
                case "63":{
                    BasicTask1 task63 = new BasicTask1();
                    task63.abbrevName();
                    System.out.println("");
                    System.out.println("READY");


                }
                break;
                case "68":{
                    BasicTask1 task68 = new BasicTask1();
                    task68.toAlternativeString();
                    System.out.println("");
                    System.out.println("READY");


                }
                break;
                case "72":{
                    BasicTask1 task72 = new BasicTask1();
                    task72.filterOddNumber();
                    System.out.println("");
                    System.out.println("READY");


                }
                break;



            }
        }
    }
}
