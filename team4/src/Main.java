import andrii_yaremko.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Enter task's number");
            switch (sc.next()){
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
                }
                break;
            }
        }
    }
}
