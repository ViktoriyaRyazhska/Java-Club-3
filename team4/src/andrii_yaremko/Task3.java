package andrii_yaremko;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public void getVolumeOfCubiod(){
        System.out.println("Enter length,width,height ");
        Scanner scanner = new Scanner(System.in);
        double lenght = scanner.nextDouble();
        double wigth = scanner.nextDouble();
        double height = scanner.nextDouble();
        System.out.println(lenght*wigth*height);
    }
}
