package andrii_yaremko;

import java.util.Scanner;

public class Task21 {
    public void addSalaryAndBonuses(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter worker salary");
        int a = scanner.nextInt();
        System.out.println("Enter bonuse true/false");
        boolean b = scanner.nextBoolean();
        if(b==true)
            System.out.println(a*10+"£");
        else
            System.out.println(a+"£");

    }
}
