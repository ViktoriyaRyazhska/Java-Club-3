
import andrii_yaremko.*;

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

            }
        }
    }
}