package andrii_yaremko;

public class Task33 {
    public String humanYearsCatYearsDogYears(int ageHuman){
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
        return ageHuman+""+yearsCat+""+yearsDog;
    }
}
