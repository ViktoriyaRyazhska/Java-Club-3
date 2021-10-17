package andrii_yaremko;

import java.util.Scanner;

public class Task18 {
    public void opposite(){
        System.out.println("Enter your number");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        if(a>0){
            System.out.println(a-(a*2));
        }
        else if(a<0){
            System.out.println(a-(a*2));
        }
        else
            System.out.println(0);
    }
}
