
<<<<<<< HEAD
import svyshcho_illya.BasicTask1;



=======
import andrii_yaremko.*;
>>>>>>> 72c554c6604b9ed8c20718b5cfc2f7cd94b030b5

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu :");
        System.out.println("3) getVolumeOfCubiod\n" +
                "6) to_binary\n" +
                "9) makeNegative\n" +
                "12) addPerson\n" +
                "15) show\n" +
                "18) opposite\n" +
                "21) addSalaryAndBonuses\n" +
                "24) operations\n" +
                "29) enough \n" +
                "33) humanYearsCatYearsDogYears\n" +
                "37) reverse\n" +
                "41) fixTheMeerkat\n" +
                "45) gap\n" +
                "49) encode\n" +
                "53) sayHello\n" +
                "57) noSpace\n" +
                "61) position\n" +
                "65) abbrevName\n" +
                "69) toAlternativeString\n" +
                "73) filterOddNumber");

        while (true) {
<<<<<<< HEAD
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
                    task.Past(h,m,s);
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
                    task.isDivisiblex(n,x,y);
                    System.out.println("READY");

                }
                break;
                //22--
                case "16666": {
                    BasicTask1 task = new BasicTask1();
                    task.CalculateAge();
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
                    task.isLove( flower1,flower2);
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
                //31
                case "31": {

                    System.out.println("Enter days:");
                    int d = myObj.nextInt();
                    BasicTask1 task = new BasicTask1();
                    task.rentalCarCost(d);
                    System.out.println("READY");

                }
                break;
                //35
                case "35": {

                    System.out.println("Enter size of array:");
                    int size = myObj.nextInt();
                    int[] arr = new int[size];
                    for(int i = 0;i<size;i++){
                        System.out.println("Enter "+ i + " element: ");
                        arr[i] = myObj.nextInt();
                    }
                    BasicTask1 task = new BasicTask1();
                    task.map(size,arr);
                    System.out.println("READY");

                }
                break;
                //39
                case "39": {

                    System.out.println("Enter size of array:");
                    int size = myObj.nextInt();
                    int[] x = new int[size];
                    for(int i = 0;i<size;i++){
                        System.out.println("Enter "+ i + " element: ");
                        x[i] = myObj.nextInt();
                    }
                    BasicTask1 task = new BasicTask1();
                    task.grow(size,x);
                    System.out.println("READY");

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
                //71--
                case "71": {


                    BasicTask1 task = new BasicTask1();
                    task.filterOddNumber();
                    System.out.println("READY");

                }
                break;





=======
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter task's number:");
            switch (sc.next()) {
                case "3": {
                    Task3 task3 = new Task3();
                    System.out.println("Enter length,width,height ");
                    double lenght = scanner.nextDouble();
                    double wigth = scanner.nextDouble();
                    double height = scanner.nextDouble();
                    task3.getVolumeOfCubiod(lenght,wigth,height);
                }
                break;
                case "6": {
                    Task6 task6 = new Task6();
                    System.out.println("Please enter a number");
                    int a = scanner.nextInt();
                    task6.to_binary(a);
                }
                break;
                case "9": {
                    Task9 task9 = new Task9();
                    System.out.println("Please enter a number");
                    double a = scanner.nextDouble();
                    task9.makeNegative(a);
                }
                break;
                case "12": {
                    System.out.println("Enter name and second name");
                    int id = scanner.nextInt();
                    String secondName = scanner.nextLine();
                    Task12 task12 = new Task12(id,secondName);
                    System.out.println(task12);
                }
                case "15": {
                    System.out.println("Enter width and height");
                    int width = scanner.nextInt();
                    int height = scanner.nextInt();
                    Task15 task15 = new Task15(width,height);
                    System.out.println("Draw enter x1 x2 x3 x4");
                    int x1 = scanner.nextInt();
                    int x2 = scanner.nextInt();
                    int x3 = scanner.nextInt();
                    int x4 = scanner.nextInt();
                    task15.draw(x1,x2,x3,x4);
                }
                break;
                case "18": {
                    Task18 task18 = new Task18();
                    System.out.println("Enter your number");
                    double a = scanner.nextDouble();
                    task18.opposite(a);
                }
                case "21": {
                    Task21 task21 = new Task21();
                    System.out.println("Enter worker salary");
                    int a = scanner.nextInt();
                    System.out.println("Enter bonuse true/false");
                    boolean b = scanner.nextBoolean();
                    task21.addSalaryAndBonuses(a,b);
                }
                break;
                case "24": {
                    Task24 task24 = new Task24();
                    System.out.println("Enter you number");
                    double a = scanner.nextDouble();
                    System.out.println("Enter operation + or - or * or /");
                    String operation = scanner.next();
                    System.out.println("Enter you number");
                    double b = scanner.nextDouble();
                    task24.operations(a,b,operation);
                }
                break;
                case "29": {
                    Task29 task29 = new Task29();
                    System.out.println("Enter nomber");
                    String b  = scanner.next();
                    task29.enough(b);
                }
                break;
                case "33": {
                    Task33 task339 = new Task33();
                    System.out.println("Enter human year");
                    int ageHuman = scanner.nextInt();
                    task339.humanYearsCatYearsDogYears(ageHuman);
                }
                break;
                case "37": {
                    Task37 task37 = new Task37();
                    System.out.println("Enter number");
                    int a = scanner.nextInt();
                    task37.reverse(a);
                }
                break;
                case "41": {
                    Task41 task41 = new Task41();
                    task41.fixTheMeerkat();
                }
                case "45": {
                    Task45 task45 = new Task45();
                    System.out.println("Enter Gap");
                    int g = scanner.nextInt();
                    System.out.println("Enter start number");
                    long m = scanner.nextLong();
                    System.out.println("Enter finish number");
                    long n = scanner.nextLong();
                    task45.gap(g,m,n);

                }
                break;
                case "49": {
                    Task49 task49 = new Task49();
                    System.out.println("Enter source");
                    String source = scanner.next();
                    task49.encode(source);
                }
                break;
                case "53": {
                    Task53 task53 = new Task53();
                    System.out.println("Enter name");
                    String name = scanner.next();
                    System.out.println("Enter city");
                    String city = scanner.next();
                    System.out.println("Enter state");
                    String state = scanner.next();
                    task53.sayHello(name,city,state);
                }
                break;
                case "57": {
                    Task57 task57 = new Task57();
                    System.out.println("Enter words");
                    String x = scanner.nextLine();
                    task57.noSpace(x);
                }
                break;
                case "61": {
                    Task61 task61 = new Task61();
                    System.out.println("Enter letter");
                    String alphabet = scanner.next();
                    task61.position(alphabet);
                }
                break;
                case "65": {
                    Task65 task65 = new Task65();
                    System.out.println("Eneter Name and secondName");
                    String name = scanner.nextLine();
                    task65.abbrevName(name);
                }
                break;
                case "69": {
                    Task69 task69 = new Task69();
                    System.out.println("Enter text");
                    String string = scanner.nextLine();
                    task69.toAlternativeString(string);
                }
                break;
                case "73": {
                    Task73 task73 = new Task73();
                    System.out.println("Enter 5 numbers");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    int c = scanner.nextInt();
                    int d = scanner.nextInt();
                    int i = scanner.nextInt();
                    task73.filterOddNumber(a,b,c,d,i);
                }
                break;

>>>>>>> 72c554c6604b9ed8c20718b5cfc2f7cd94b030b5
            }


        }
    }
<<<<<<< HEAD
}


=======
}
>>>>>>> 72c554c6604b9ed8c20718b5cfc2f7cd94b030b5
