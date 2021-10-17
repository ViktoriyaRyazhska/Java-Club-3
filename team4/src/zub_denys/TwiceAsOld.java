package zub_denys;

import java.util.Scanner;

public class TwiceAsOld {
    public static int TwiceAsOlds(int dadYears, int sonYears){

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter age of dad: ");
//        int dadYears = sc.nextInt();
//        System.out.println("Enter age of son: ");
//        int sonYears = sc.nextInt();

        int twice = dadYears - sonYears * 2;
        if (twice > 0){
            System.out.println("Dad will be twice as old in " );
        }
        else {
            System.out.println("The father was twice as old as his son ");
        }
        return twice < 0 ?  twice * (-1) : twice;
    }
}
