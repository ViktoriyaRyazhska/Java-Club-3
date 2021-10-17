package andrii_yaremko;

import java.util.Scanner;

public class Task33 {
    public void humanYearsCatYearsDogYears(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter human year");
        int ageHuman = scanner.nextInt();
        int yearsCat = 0;
        int yearsDog = 0;
        int counter = ageHuman;
        while (counter > 0) {
            if(counter == 2){
                yearsCat += 9;
                yearsDog += 9;
                counter--;
            } else if( counter == 1){
                yearsCat += 15;
                yearsDog += 15;
                counter--;
            } else {
                yearsCat += 4;
                yearsDog += 5;
                counter--;
            }
        }
        System.out.println(ageHuman);
        System.out.println(yearsCat);
        System.out.println(yearsDog);
    }
}
