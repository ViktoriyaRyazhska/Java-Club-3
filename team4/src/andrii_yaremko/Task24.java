package andrii_yaremko;

import java.util.Scanner;

public class Task24 {
    public void operations(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you number");
        double a = scanner.nextDouble();
        System.out.println("Enter operation + or - or * or /");
        String operation = scanner.next();
        System.out.println("Enter you number");
        double b = scanner.nextDouble();

        if(operation.equals("+"))
            System.out.println(a+b);
        else if(operation.equals("-"))
            System.out.println(a-b);
        else if(operation.equals("*"))
            System.out.println(a*b);
        else if(operation.equals("/")){
            if(b==0){
                System.out.println("cannot be divided by 0");
            }
            else
                System.out.println(a/b);
        }
    }
}
