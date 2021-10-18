
import svyshcho_illya.BasicTask1;
import andrii_yaremko.*;
import zub_denys.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu :");
        System.out.println(
                "1) doubleInteger\n" +
                        "3) getVolumeOfCubiod\n" +
                        "4) isDivisible\n" +
                        "6) to_binary\n" +
                        "7) Past\n" +
                        "9) makeNegative\n" +
                        "10) datingRange\n" +
                        "12) addPerson\n" +
                        "13) Dinglemouse\n" +
                        "15) show\n" +
                        "16) declareWinner\n" +
                        "18) opposite\n" +
                        "19) isDivisiblex\n" +
                        "20) convertBooleanToString\n" +
                        "21) addSalaryAndBonuses\n" +
                        "22) CalculateAge\n" +
                        "24) operations\n" +
                        "25) isLove\n" +
                        "28) sequence \n" +
                        "29) enough \n" +
                        "30) trafficLights\n" +
                        "31) rentalCarCost\n" +
                        "33) humanYearsCatYearsDogYears\n" +
                        "34) getTheMeanOfAnArray\n" +
                        "35) map\n" +
                        "37) reverse\n" +
                        "38) howGoodAreYouReally\n" +
                        "39) grow\n" +
                        "41) fixTheMeerkat\n" +
                        "42) twiceAsOld\n" +
                        "43) nearestSq\n" +
                        "45) gap\n" +
                        "46) sticks\n" +
                        "47) God\n" +
                        "49) encode\n" +
                        "51) numberToString\n" +
                        "53) sayHello\n" +
                        "54) oppositeNumber\n" +
                        "55) replaceDots\n" +
                        "57) noSpace\n" +
                        "59) position\n" +
                        "61) position\n" +
                        "62) grooshopperDebug\n" +
                        "63) abbrevName\n" +
                        "65) abbrevName\n" +
                        "66) correctTheMistakesOfTheCharacterRecognitionSoftware\n" +
                        "67) toAlternativeString\n" +
                        "69) toAlternativeString\n" +
                        "70) unfinishedLoopBug\n" +
                        "71) filterOddNumber\n" +
                        "73) filterOddNumber");

        while (true) {
            System.out.println("Enter task's number:");
            Scanner myObj = new Scanner(System.in);

            switch (sc.next()) {


                case "1": {
                    BasicTask1 task = new BasicTask1();
                    System.out.println("Enter number:");

                    double numb = myObj.nextDouble();
                    task.doubleInteger(numb);
                    System.out.println("READY");

                }
                break;
                case "4": {
                    BasicTask1 task = new BasicTask1();
                    System.out.println("Enter number w:");
                    int wnumb = myObj.nextInt();
                    System.out.println("Enter number p:");
                    int pnumb = myObj.nextInt();
                    task.isDivisible(wnumb, pnumb);
                    System.out.println("READY");

                }
                break;
                //7
                case "7": {
                    BasicTask1 task = new BasicTask1();
                    System.out.println("Enter number h:");
                    int h = myObj.nextInt();
                    System.out.println("Enter number m:");
                    int m = myObj.nextInt();
                    System.out.println("Enter number s:");
                    int s = myObj.nextInt();
                    task.Past(h, m, s);
                    System.out.println("READY");

                }
                break;
                //10
                case "10": {
                    BasicTask1 task = new BasicTask1();
                    System.out.println("Enter age:");
                    int age = myObj.nextInt();
                    task.datingRange(age);
                    System.out.println("READY");

                }
                break;
                //13--
                case "13": {
                    BasicTask1 task = new BasicTask1();
                    task.Dinglemouse();
                    System.out.println("READY");

                }
                break;
                //16--
                case "16": {
                    BasicTask1 task = new BasicTask1();
                    task.declareWinner();
                    System.out.println("READY");

                }
                break;
                //19
                case "19": {
                    BasicTask1 task = new BasicTask1();
                    System.out.println("Enter n:");
                    int n = myObj.nextInt();
                    System.out.println("Enter x:");
                    int x = myObj.nextInt();
                    System.out.println("Enter y:");
                    int y = myObj.nextInt();
                    task.isDivisiblex(n, x, y);
                    System.out.println("READY");

                }
                break;
                case "20": {
                    System.out.println(YesOrNo.boolToWord(true));
                }
                break;
                //22--
                case "22": {
                    BasicTask1 task = new BasicTask1();
                    System.out.println("Enter number birth:");
                    int birth = myObj.nextInt();
                    System.out.println("Enter number yearTo:");
                    int yearTo = myObj.nextInt();
                    task.CalculateAge(birth, yearTo);
                    System.out.println("READY");

                }
                break;
                //25
                case "25": {

                    System.out.println("Enter flower one:");
                    int flower1 = myObj.nextInt();
                    System.out.println("Enter flower two:");
                    int flower2 = myObj.nextInt();
                    BasicTask1 task = new BasicTask1();
                    task.isLove(flower1, flower2);
                    System.out.println("READY");

                }
                break;
                //28
                case "28": {

                    System.out.println("Enter n:");
                    int n = myObj.nextInt();
                    BasicTask1 task = new BasicTask1();
                    task.sequence(n);
                    System.out.println("READY");

                }
                break;
                case "30": {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter color: ");
                    String color = scanner.next();
                    color = color.toLowerCase(Locale.ROOT);
                    System.out.println(TrafficLights.updateLight(color));
                }
                break;
                //31
                case "31": {

                    System.out.println("Enter days:");
                    int d = myObj.nextInt();
                    BasicTask1 task = new BasicTask1();
                    task.rentalCarCost(d);
                    System.out.println("READY");

                }
                break;
                case "34": {

                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Enter length of array: ");   //Вводимо на екран довжину массиву
                    int size = scanner.nextInt();
                    int[] marks = new int[size];
                    //
                    System.out.print("Input marks: ");   //Вводимо елементи массиву
                    for (int k = 0; k < size; k++) {
                        marks[k] = scanner.nextInt();
                    }
                    //
                    System.out.println("Your array is: ");     //Виводимо на екран массив
                    for (int j = 0; j < marks.length; j++) {
                        System.out.print(" " + marks[j]);
                    }
                    System.out.println(Avarage.getAvarage(marks));
                }
                break;
                //35
                case "35": {

                    System.out.println("Enter size of array:");
                    int size = myObj.nextInt();
                    int[] arr = new int[size];
                    for (int i = 0; i < size; i++) {
                        System.out.println("Enter " + i + " element: ");
                        arr[i] = myObj.nextInt();
                    }
                    BasicTask1 task = new BasicTask1();
                    task.map(size, arr);
                    System.out.println("READY");

                }
                break;
                case "38": {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter a size of array: ");  //Вводимо розмір масиву
                    int size = scanner.nextInt();
                    int[] classPoints = new int[size];

                    System.out.println("Input marks: ");            //Вводимо елементи масиву
                    for (int k = 0; k < size; k++) {
                        classPoints[k] = scanner.nextInt();
                    }
                    System.out.println("All marks: ");              //Виводимо масив
                    for (int j = 0; j < classPoints.length; j++) {
                        System.out.println(" " + classPoints[j]);
                    }
                    System.out.println("Enter your mark: ");
                    int yourPoints = scanner.nextInt();
                    System.out.println(GoodReally.betterThanAverage(classPoints, yourPoints));
                }
                break;
                //39
                case "39": {

                    System.out.println("Enter size of array:");
                    int size = myObj.nextInt();
                    int[] x = new int[size];
                    for (int i = 0; i < size; i++) {
                        System.out.println("Enter " + i + " element: ");
                        x[i] = myObj.nextInt();
                    }
                    BasicTask1 task = new BasicTask1();
                    task.grow(size, x);
                    System.out.println("READY");

                }
                break;
                case "42": {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter age of dad: ");
                    int dadYears = scanner.nextInt();
                    System.out.println("Enter age of son: ");
                    int sonYears = scanner.nextInt();
                    System.out.println(TwiceAsOld.TwiceAsOlds(dadYears, sonYears));
                }
                break;
                //43
                case "43": {

                    System.out.println("Enter number:");
                    int n = myObj.nextInt();
                    BasicTask1 task = new BasicTask1();
                    task.nearestSq(n);
                    System.out.println("READY");

                }
                break;
                case "46": {
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Enter count of sticks: ");
                    int sticks = scanner.nextInt();
                    System.out.println(Sticks.makeMove(sticks));
                }
                break;
                //47--
                case "47": {


                    BasicTask1 task = new BasicTask1();
                    task.God();
                    System.out.println("READY");

                }
                break;
                //51
                case "51": {
                    System.out.println("Enter number:");
                    int num = myObj.nextInt();
                    BasicTask1 task = new BasicTask1();
                    task.numberToString(num);
                    System.out.println("READY");

                }
                break;
                case "54": {
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Enter number: ");
                    int number = scanner.nextInt();
                    System.out.println(OppositeNumber.opposite(number));
                }
                break;
                //55
                case "55": {
                    System.out.println("Enter str:");
                    String str = myObj.nextLine();
                    BasicTask1 task = new BasicTask1();
                    task.replaceDots(str);
                    System.out.println("READY");

                }
                break;
                //59
                case "59": {

                    System.out.println("Enter str:");
                    char alphabet = myObj.next().charAt(0);
                    BasicTask1 task = new BasicTask1();
                    task.position(alphabet);
                    System.out.println("READY");

                }
                break;
                case "62": {
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Enter temperature in fahrenheit: ");
                    int temp = scanner.nextInt();
                    System.out.println(Grasshopper.weatherInfo(temp));
                }
                break;
                //63
                case "63": {

                    System.out.println("Enter str:");
                    String name = myObj.nextLine();
                    BasicTask1 task = new BasicTask1();
                    task.abbrevName(name);
                    System.out.println("READY");

                }
                break;
                //67
                case "67": {

                    System.out.println("Enter str:");
                    String string = myObj.nextLine();
                    BasicTask1 task = new BasicTask1();
                    task.toAlternativeString(string);
                    System.out.println("READY");

                }
                break;
                case "70": {
                    Scanner scanner = new Scanner(System.in);
                    int number = scanner.nextInt();
                    System.out.println(InfiniteLoop.createList(number));
                }
                break;
                //71--
                case "71": {
                    BasicTask1 task = new BasicTask1();
                    task.filterOddNumber();

                }
                break;
            }
        }
    }
}