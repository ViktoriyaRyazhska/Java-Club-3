package svyshcho_illya;
import java.util.Scanner;

public class BasicTask4 {
    public boolean isDivisible() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number w:");

        int wnumb = myObj.nextInt();
        System.out.println("Enter number p:");
        int pnumb = myObj.nextInt();
        boolean res = false;
        if(wnumb % pnumb == 0){
            res = true;
        }
        return res;
    }
}
