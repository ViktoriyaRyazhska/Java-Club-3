import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HowGoodAreYouReally {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
       int summa = 0;
       for(int i = 0; i < classPoints.length; i++) summa += classPoints[i];

       if(yourPoints > summa / classPoints.length) return true;
       return false;
    }

    public static void main(String[] args) {
        System.out.println("Write students points [1-5]: ");
        Scanner in = new Scanner(System.in);

        String marksString = in.nextLine();

        ArrayList<String> marks = new ArrayList<>(Arrays.asList(marksString.split(" ")));

        marks.stream().forEach(x -> Integer.parseInt(x));

        System.out.print("Enter your point [1-5]: ");

        int yourPoints = in.nextInt();

        int studentMarks[] = new int[marks.size()];

        for(int i = 0; i < marks.size(); i++)
            studentMarks[i] = Integer.parseInt(marks.get(i));

        System.out.println("Are you the best: " + betterThanAverage(studentMarks,yourPoints));

    }
}
