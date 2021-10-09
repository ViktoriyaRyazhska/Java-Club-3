package com.club3.java;

import com.club3.java.utils.classes.GrassHopper;

import java.util.Scanner;

public class Strings {

    private String grasshopperDebug() {
        System.out.println("\nYour friend is traveling abroad to the United States so he wrote a program to convert fahrenheit to celsius. Unfortunately his code has some bugs." +
                "\n Find the errors in the code to get the celsius converter working properly.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature:");
        double temp = scanner.nextDouble();
        return GrassHopper.weatherInfo(temp);
    }

    private String correctMistakesOfCharacter() {
        System.out.println("\n When documents (especially pretty old ones written with a typewriter), are digitised character recognition softwares often make mistakes." +
                "\n Your task is correct the errors in the digitised text. You only have to handle the following mistakes:" +
                "\n S is misinterpreted as 5\n" +
                "\n O is misinterpreted as 0\n" +
                "\n I is misinterpreted as 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string replacing 'S' as '5', 'O' as '0' and 'I' as '1': ");
        String string = scanner.nextLine();
        return string.replace("5", "S").replace("0", "O").replace("1", "I");
    }

    private String tripleTrouble() {
        System.out.println("\n Create a function that will return a string that combines all of the letters of the three inputed strings in groups. " +
                "\n Taking the first letter of all of the inputs and grouping them next to each other.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string one:");
        String one = scanner.nextLine();
        System.out.println("Enter string two:");
        String two = scanner.nextLine();
        System.out.println("Enter string three:");
        String three = scanner.nextLine();

        StringBuilder s = new StringBuilder();
        for (int i = 0; i < one.length(); i++) {
            s.append("").append(one.charAt(i)).append(two.charAt(i)).append(three.charAt(i));
        }
        return s.toString();
    }


        private void displayMenu () {
            System.out.println("\n Please, choose a task:" +
                    "\n " +
                    "\n 1. Grasshopper Debug" +
                    "\n 2. Correct mistakes of character" +
                    "\n 3. Triple Trouble" +
                    "\n 4. Return to main menu");
        }

        public void runStings () {
            displayMenu();
            Scanner scanner = new Scanner(System.in);
            int choice;
            do {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println(grasshopperDebug());
                        break;
                    case 2:
                        System.out.println(correctMistakesOfCharacter());
                        break;
                    case 3:
                        System.out.println(tripleTrouble());
                        break;
                    case 4:
                        System.out.println("\n Welcome to main menu \n __________________________");
                        Menu menu = new Menu();
                        menu.runApplication();
                        break;
                    default:
                        System.out.println("There are not number like this");
                        break;
                }
            } while (choice != 4);
        }
    }
