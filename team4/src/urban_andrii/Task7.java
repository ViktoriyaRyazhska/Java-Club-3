package urban_andrii;

public class Task7 {
    public static int century(int number) {

        int count = 0;
        while (number>0){
            number= number-100;
            count+=1;
        }
        return count;
    }
}

