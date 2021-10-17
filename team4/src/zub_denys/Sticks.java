package zub_denys;

import java.util.Locale;
import java.util.Scanner;

public class Sticks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count of sticks: ");
        int sticks = sc.nextInt();
        System.out.println("Count of sticks " + sticks);

        System.out.println("Would you like to be a first? Y/n");
        String first = sc.next();
        first = first.toLowerCase(Locale.ROOT);

        int take = 0;

        System.out.println("Game is started.");

        while(sticks>0) {
            if(first.equals("y") ) {
                for (int i = 0; i < sticks; i++) {
                    System.out.println("How many sticks to take? 1 | 2 | 3");
                    take = sc.nextInt();
                    if (take > 3 || take < 0) {
                        System.out.println("Wrong number");
                        continue;
                    }
                    sticks -= take;
                    System.out.println("You take " +take + " ----> " + sticks + " left");
                    if(sticks<=0){
                        System.out.println("You winner!");
                        break;
                    }
                    System.out.println("How many sticks to take? 1 | 2 | 3");
                    take = sc.nextInt();
                    if (take > 3 || take < 0) {
                        System.out.println("Wrong number");
                        continue;
                    }
                    sticks -= take;
                    System.out.println("Opponent take " +take + " ----> " + sticks + " left");
                    if(sticks<=0){
                        System.out.println("Opponent winner!");
                        break;
                    }
                }

            }
            if(first.equals("n")) {
                for (int i = 0; i < sticks; i++) {
                    System.out.println("How many sticks to take? 1 | 2 | 3");
                    take = sc.nextInt();
                    if (take > 3 || take < 0) {
                        System.out.println("Wrong number");
                        continue;
                    }
                    sticks -= take;
                    System.out.println("Opponent take " +take + " ----> " + sticks + " left");
                    if(sticks<=0){
                        System.out.println("Opponent winner!");
                        break;
                    }
                    System.out.println("How many sticks to take? 1 | 2 | 3");
                    take = sc.nextInt();
                    if (take > 3 || take < 0) {
                        System.out.println("Wrong number");
                        continue;
                    }
                    sticks -= take;
                    System.out.println("You take " +take + " ----> " + sticks + " left");
                    if(sticks<=0){
                        System.out.println("You winner!");
                        break;
                    }
                }
            }
//            if (first.equals("yes")) {
//                System.out.println("How many sticks do you want to take? 1 | 2 | 3");
//                take = sc.nextInt();
//            }
//            if(take == 3){
//
//            }
        }
    }
}