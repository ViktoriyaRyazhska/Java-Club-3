package zub_denys;

import java.util.Scanner;

public class Age {
    public static String CalculateAge() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year to: ");
        int yearTo = sc.nextInt();
        System.out.println("Enter your birth: ");
        int birth = sc.nextInt();
        int age = yearTo - birth;
        if (age > 1) {
            //System.out.println("You are " + age + " years old.");
            return  ("You are " + age + " years old.");
        } else if (age == 1) {
            //System.out.println("You are " + age + " year old.");
            return "You are " + age + " year old.";
        } else if (age < -1) {
            //System.out.println("You will be born in " + Math.abs(age) + " years.");
            return "You will be born in " + Math.abs(age) + " years.";
        } else if (age == -1) {
            //System.out.println("You will be born in " + Math.abs(age) + " year.");
            return "You will be born in " + Math.abs(age) + " year.";
        } else {
            //System.out.println("You were born this very year!");
            return "You were born this very year!";
        }
    }

    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter year to: ");
////        int yearTo = sc.nextInt();
////        System.out.println("Enter your birth: ");
////        int birth = sc.nextInt();
//
       System.out.println(new Age().CalculateAge());
   }
}
