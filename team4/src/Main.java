import urban_andrii.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

                break;
                case "14": {
                }
                break;
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
            }
        }
    }
}
