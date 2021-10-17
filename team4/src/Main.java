<<<<<<< HEAD
import urban_andrii.*;
=======
<<<<<<< HEAD
import svyshcho_illya.BasicTask1;
=======
import andrii_yaremko.*;
>>>>>>> 7bc58570a59026c3e2a1b3b33cd145da7790ae49
>>>>>>> fdfa75a9f70ab9f78c8309be409f7d4709a60713

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
                "41) fixTheMeerkat\n"+
                "45) gap\n"+
                "49) encode\n"+
                "53) sayHello\n"+
                "57) noSpace\n"+
                "61) position\n"+
                "65) abbrevName\n"+
                "69) toAlternativeString\n"+
                "73) filterOddNumber");

<<<<<<< HEAD
        while (true) {
            System.out.println("Enter task's number");
            switch (sc.next()) {
                case "1": {

                }
                break;
                case "2": {
                    TaskX taskX = new TaskX();
                    taskX.multiply();
                }
                break;
                case "3": {

                }
                break;
                case "4": {


                }
                break;
                case "5": {
                    Task5 task5 = new Task5();
                    task5.greet();

                }
                break;
                case "6": {


                }
                break;
                case "7": {

                }
                break;
                case "8": {

                }
                break;
                case "9": {

                }
                break;
                case "10": {

                }
                break;
                case "11": {
                }
                break;
                case "12": {
                }
                break;
                case "13": {
                }
=======
        while (true){
            System.out.println("Enter task's number:");
            switch (sc.next()){
<<<<<<< HEAD
                case "1":{
                    BasicTask1 task = new BasicTask1();
                    task.doubleInteger();
                    System.out.println("READY");
>>>>>>> fdfa75a9f70ab9f78c8309be409f7d4709a60713

                break;
                case "14": {
                }
                break;
<<<<<<< HEAD
                case "15": {

                }
                break;
                case "16": {

                }

                break;
                case "17": {

                }
                break;
                case "18": {
                }
                break;
                case "19": {

                }
                break;
                case "20": {

                }
                break;
                case "21": {

                }
                break;
                case "22": {

                }
                break;
                case "23": {

                }
                break;
                case "24": {

                }
                break;
                case "25": {
                    Task25 task25=new Task25();
                    task25.isLove();
                }
                break;
                case "26": {

                }
                break;
                case "27": {

                }
                break;
                case "28": {
                    Task28 task28=new Task28();
                    task28.mod();

                }
                break;
                case "29": {

                }
                break;
                case "30": {

                }
                break;
                case "31": {

                }
                break;
                case "32": {
//                    Task32 task32 = new Task32();
//                    task32.repeatStr();
                }
                break;
                case "33": {

                }
                break;
                case "64": {
                    System.out.println("Plz Enter string: ");
                    Scanner scanner = new Scanner(System.in);
                    String a = scanner.nextLine();
                    System.out.println("Plz enter char: ");
                    char c = scanner.next(".").charAt(0);
                    Task64 task64 = new Task64();
                    task64.strCount(a,c);

                }
                break;
                case "35": {

                }
                break;
                case "36": {

                }
                break;
                case "37": {

                }
=======
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
<<<<<<< HEAD
                case "45": {
                    Task45 task45 = new Task45();
                    task45.gap();
                }
                break;
                case "49": {
                    Task49 task49 = new Task49();
                    task49.encode();
                }
                break;
                case "53": {
                    Task53 task53 = new Task53();
                    task53.sayHello();
                }
                break;
                case "57": {
                    Task57 task57 = new Task57();
                    task57.noSpace();
                }
                break;
                case "61": {
                    Task61 task61 = new Task61();
                    task61.position();
                }
                break;
                case "65": {
                    Task65 task65 = new Task65();
                    task65.abbrevName();
                }
                break;
                case "69": {
                    Task69 task69 = new Task69();
                    task69.toAlternativeString();
                }
                break;
                case "73": {
                    Task73 task73 = new Task73();
                    task73.filterOddNumber();
                }
                break;
=======
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



>>>>>>> 8672301912901def160e3d9aa6307f934363200b
>>>>>>> fdfa75a9f70ab9f78c8309be409f7d4709a60713
            }
        }
    }
}
