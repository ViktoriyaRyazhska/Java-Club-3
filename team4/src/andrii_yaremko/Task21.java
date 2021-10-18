package andrii_yaremko;

import java.util.Scanner;

public class Task21 {
    public String addSalaryAndBonuses(int a,boolean b){
        if(b==true) {
            System.out.println(a * 10 + "£");
            return "£"+a * 10;
        }
        else
            System.out.println(a+"£");
        return "£"+a;

    }
}
