package urban_andrii;

public class Task40 {
    public static int sum(int[] arr){

        int a = 0;
        int b = 0;
        for(int i : arr){
            if( i >=0){
                a+=i;
            }

        }
        return a;
    }

}

