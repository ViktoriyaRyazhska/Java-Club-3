import svyshcho_illya.BasicTask1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Enter task's number:");
            switch (sc.next()){
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
