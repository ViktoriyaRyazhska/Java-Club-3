package urban_andrii;

import java.util.Scanner;

public class Task5 {
    public void greet(){
        Scanner scanner = new Scanner(System.in);
        System.out.println( " Enter 1 number: ");
        System.out.println(" Enter name:  ");
        String name = scanner.next();
        if (name == "Johnny") {
            System.out.println("Hello, my love!");
        }
        else {
            System.out.println("Hello, " + name);
        }
     }
}


