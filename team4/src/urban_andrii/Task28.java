package urban_andrii;

import java.util.Scanner;

public class Task28 {
    public void mod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println( " Enter  N: ");
        int n = scanner.nextInt();
        int n1=0;
        int n2=1;
        int i=0;
        int ans =0;
        while(i!=n-2){
            ans=(n1+n2)%3;
            n1=n2;
            n2=ans;
            i=i + 1;
        }
        System.out.println(ans);
    }
}

