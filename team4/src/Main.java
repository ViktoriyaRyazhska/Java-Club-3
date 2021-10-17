import andrii_yaremko.*;

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
            }
        }
    }
}
