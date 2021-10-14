package zub_denys;

import java.util.Scanner;

public class GoodReally {
    public static boolean betterThanAverage() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size of array: ");  //Вводимо розмір масиву
        int size = sc.nextInt();
        int [] classPoints = new int[size];

        System.out.println("Input marks: ");            //Вводимо елементи масиву
        for(int k = 0;k<size;k++){
            classPoints[k] = sc.nextInt();
        }
        System.out.println("All marks: ");              //Виводимо масив
        for(int j = 0; j< classPoints.length;j++){
            System.out.println(" " + classPoints[j]);
        }
        // Your code here
        int sum = 0;
        int avarage = 0;
       for(int i = 0;i< classPoints.length;i++){
           sum+=classPoints[i];
       }
       avarage = sum/ classPoints.length;
        System.out.println("Avarage mark other student: " + avarage);
        System.out.println("You better than other?");
        System.out.println("Enter your mark: ");
        int yourPoints = sc.nextInt();
       return avarage < yourPoints ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(betterThanAverage());
    }
}
