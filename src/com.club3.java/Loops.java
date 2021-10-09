package com.club3.java;

import java.util.Arrays;
import java.util.Scanner;

public class Loops {


    public void map35() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter numbers");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i<arr.length ; i++)
        {
            arr[i]*=2;
        }
        System.out.println(Arrays.toString(arr));


    }

    public int grow39(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array ");
        int n = scanner.nextInt();
        int[] x = new int[n];
        System.out.println("Please enter numbers");
        for (int i = 0; i < x.length; i++)
        {
            x[i] = scanner.nextInt();
        }

        int mult = 1;
        for (int i = 0; i< x.length;i++)
        {
            mult *= x[i];
        }

        return mult;

    }
}
