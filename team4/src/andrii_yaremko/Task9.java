package andrii_yaremko;

import java.util.Scanner;

public class Task9 {
     public double makeNegative(double a){
         if(a>0){
             double b = a - (a*2);
             System.out.println(b);
             return b;
         }
         else
             System.out.println(a);
         return a;

    }
}
