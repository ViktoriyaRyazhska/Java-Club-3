package zub_denys;

import java.util.Scanner;

public class Avarage {
    public static int getAvarage(){
        Scanner sc = new Scanner(System.in);
        //
        System.out.print("Enter length of array: ");   //Вводимо на екран довжину массиву
        int size = sc.nextInt();
        int [] marks = new int[size];
        //
        System.out.print("Input array elements: ");   //Вводимо елементи массиву
        for(int i = 0; i<size;i++){
            marks[i] = sc.nextInt();
        }
        //
        System.out.println("Your array is: ");     //Виводимо на екран массив
        for (int i = 0; i<marks.length;i++){
            System.out.print(" " + marks[i]);
        }
        //
        int sum =0;
        int avarage = 0;
        for (int i = 0; i< marks.length;i++){
            sum+=marks[i];
        }
        System.out.println("\nAvarage of marks is: " );
        return avarage = sum/marks.length;
    }

    public static void main(String[] args) {
        System.out.println(getAvarage());
    }
}
