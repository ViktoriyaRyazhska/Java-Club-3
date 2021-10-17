package andrii_yaremko;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task73 {
    public void filterOddNumber() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listOfNumbers = new ArrayList<>();
        System.out.println("Enter 5 numbers");
        listOfNumbers.add(scanner.nextInt());
        listOfNumbers.add(scanner.nextInt());
        listOfNumbers.add(scanner.nextInt());
        listOfNumbers.add(scanner.nextInt());
        listOfNumbers.add(scanner.nextInt());
        listOfNumbers.removeIf(i -> i%2 == 0);

        System.out.println(listOfNumbers);;
    }
}
