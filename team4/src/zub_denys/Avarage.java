package zub_denys;

public class Avarage {
    public static int getAvarage(int []marks){
        int sum =0;
        int avarage = 0;
        for (int i = 0; i< marks.length;i++){
            sum+=marks[i];
        }
        return avarage = sum/marks.length;
    }

    public static void main(String[] args) {
        System.out.println(getAvarage(new int[]{2,3,5,4,2,2}));
    }
}
