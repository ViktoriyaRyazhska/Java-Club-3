package andrii_yaremko;

import java.util.Scanner;

public class Task9 {
     public void makeNegative(){
         System.out.println("Please enter a number");
         Scanner scanner = new Scanner(System.in);
         double a = scanner.nextDouble();
         if(a>0){
             double b = a - (a*2);
             System.out.println(b);
         }
         else
             System.out.println(a);
    }
}
