package com.softserve.team3;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class View {

    private Map<String, String> menu;
    private Map<String, Printable> methodsMenu;
    private Map<String, String> TMenu;
    private Map<String, Object> taskMenu;
    private Scanner scanner = new Scanner(System.in);

    public View() {
        menu = new LinkedHashMap<>();
        menu.put("1", " 1 - Open Basic program task-list");
        menu.put("2", " 2 - Open Classes task-list");
        menu.put("3", " 3 - Open Conditions task-list");
        menu.put("4", " 4 - Open Loops task-list");
        menu.put("5", " 5 - Open OOP task-list");
        menu.put("6", " 6 - Open String task-list");
        menu.put("7", " 7 - Open Collections task-list");
        menu.put("Q", " Q - exit");

        methodsMenu = new LinkedHashMap<>();
        methodsMenu.put("1", this::pressButton1);
        methodsMenu.put("2", this::pressButton2);
        methodsMenu.put("3", this::pressButton3);
        methodsMenu.put("4", this::pressButton4);
        methodsMenu.put("5", this::pressButton5);
        methodsMenu.put("6", this::pressButton6);
        methodsMenu.put("7", this::pressButton7);
    }

    private void pressButton1() {
        TMenu = new LinkedHashMap<>();
        TMenu.put("1", " 1 - Multiply");
        TMenu.put("2", " 2 - ToBinary");
        TMenu.put("3", " 3 - Dating");
        System.out.println(" Basic program tasks, choose one:");
        for (Object o : TMenu.values()) {
            System.out.println(o);
        }
        int choose = scanner.nextInt();
        System.out.println("Your task is - " + choose);
        taskMenu = new LinkedHashMap<>();
        taskMenu.put("1", new Multiply().multiply(choose, choose));
        taskMenu.put("2", new ToBinary().toBinary(choose));
        taskMenu.put("3", new DatingRange().datingRange(choose));

        if (taskMenu.containsKey(String.valueOf(choose))) {
            System.out.println("Enter values for " + TMenu.get(String.valueOf(choose)) + ": ");
            switch (String.valueOf(choose)) {
                case "1":
                    System.out.println((new Multiply()
                            .multiply(scanner.nextInt(), scanner.nextInt())) + " - solution !");
                    break;
                case "2":
                    System.out.println((new ToBinary()
                            .toBinary(scanner.nextInt())) + " - solution !");
                    break;
                case "3":
                    System.out.println((new DatingRange()
                            .datingRange(scanner.nextInt())) + " - solution !");
                    break;

            }
        } else {
            System.out.println("Try again!");
            pressButton1();
        }

        for (Object o : TMenu.keySet()) {
            TMenu.remove(o);
            taskMenu.remove(o);
        }
        System.out.println(TMenu);
        System.out.println(taskMenu);
    }

    private void pressButton2() {
        TMenu = new LinkedHashMap<>();
        TMenu.put("1", " 1 - Fraction");
        System.out.println(" Classes tasks, choose one:");
        for (Object o : TMenu.values()) {
            System.out.println(o);
        }
        int choose = scanner.nextInt();
        System.out.println("Your task is - " + choose);
        taskMenu = new LinkedHashMap<>();
        taskMenu.put("1", new Fraction(choose, choose).gcd(choose, choose));

        if (taskMenu.containsKey(String.valueOf(choose))) {
            System.out.println("Enter values for " + TMenu.get(String.valueOf(choose)) + ": ");
            switch (String.valueOf(choose)) {
                case "1":
                    System.out.println((new Fraction(scanner.nextInt(), scanner.nextInt())
                            .gcd(scanner.nextInt(), scanner.nextInt())) + " - solution !");
                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;

            }
        } else {
            System.out.println("Try again!");
            pressButton1();
        }

        for (Object o : TMenu.keySet()) {
            TMenu.remove(o);
            taskMenu.remove(o);
        }
        System.out.println(TMenu);
        System.out.println(taskMenu);
    }

    private void pressButton3() {
        TMenu = new LinkedHashMap<>();
        TMenu.put("1", " 1 - Opposite number");
        TMenu.put("2", " 2 - AgeDiff");
        TMenu.put("3", " 3 - YesOrNo");
        TMenu.put("4", " 4 - Traffic light");
        System.out.println(" Conditions tasks, choose one:");
        for (Object o : TMenu.values()) {
            System.out.println(o);
        }
        int choose = scanner.nextInt();
        System.out.println("Your task is - " + choose);
        taskMenu = new LinkedHashMap<>();
        taskMenu.put("1", new OppositeNumber().opposite(choose));
        taskMenu.put("2", new AgeDiff().CalculateAge(choose, choose));
        taskMenu.put("3", new YesOrNo().boolToWord(true));
        taskMenu.put("4", new TrafficLights().updateLight(""));

        if (taskMenu.containsKey(String.valueOf(choose))) {
            System.out.println("Enter values for " + TMenu.get(String.valueOf(choose)) + ": ");
            switch (String.valueOf(choose)) {
                case "1":
                    System.out.println((new OppositeNumber()
                            .opposite(scanner.nextInt())) + " - solution !");
                    break;
                case "2":
                    System.out.println((new AgeDiff()
                            .CalculateAge(scanner.nextInt(), scanner.nextInt())) + " - solution !");
                    break;
                case "3":
                    System.out.println((new YesOrNo()
                            .boolToWord(scanner.nextBoolean()) + " - solution !"));
                    break;
                case "4":
                    System.out.println((new TrafficLights()
                            .updateLight(scanner.next()) + " - solution !"));
                    break;

            }
        } else {
            System.out.println("Try again!");
            pressButton1();
        }

        for (Object o : TMenu.keySet()) {
            TMenu.remove(o);
            taskMenu.remove(o);
        }
        System.out.println(TMenu);
        System.out.println(taskMenu);
    }

    private void pressButton4() {

        TMenu = new LinkedHashMap<>();
        TMenu.put("1", " 1 - Dinglemouse");
        TMenu.put("2", " 2 - Sequence");
        TMenu.put("3", " 3 - WrongEndHead");
        TMenu.put("4", " 4 - GapInPrime");
        System.out.println(" Loops tasks, choose one:");
        for (Object o : TMenu.values()) {
            System.out.println(o);
        }
        int choose = scanner.nextInt();
        System.out.println("Your task is - " + choose);
        taskMenu = new LinkedHashMap<>();
        taskMenu.put("1", new Dinglemouse().humanYearsCatYearsDogYears(choose));
        taskMenu.put("2", new Sequence().reverse(choose));
        taskMenu.put("3", new WrongEndHead().fixTheMeerkat(new String[]{}));
        taskMenu.put("4", new GapInPrimes().gap(0, 0, 0));

        if (taskMenu.containsKey(String.valueOf(choose))) {
            System.out.println("Enter values for " + TMenu.get(String.valueOf(choose)) + ": ");
            switch (String.valueOf(choose)) {
                case "1":
                    System.out.println(Arrays.toString((new Dinglemouse()
                            .humanYearsCatYearsDogYears(scanner.nextInt()))) + " - solution !");
                    break;
                case "2":
                    System.out.println(Arrays.toString((new Sequence()
                            .reverse(scanner.nextInt()))) + " - solution !");
                    break;
                case "3":
                    System.out.println("Enter amount of items to move ");
                    int size = scanner.nextInt();
                    String[] arr = new String[size];
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = scanner.next();
                    }
                    System.out.println(Arrays.toString(new WrongEndHead().fixTheMeerkat(arr)) + " - solution !");
                    break;
                case "4":
                    System.out.println((new TrafficLights()
                            .updateLight(scanner.next()) + " - solution !"));
                    break;

            }
        } else {
            System.out.println("Try again!");
            pressButton1();
        }

        for (Object o : TMenu.keySet()) {
            TMenu.remove(o);
            taskMenu.remove(o);
        }
        System.out.println(TMenu);
        System.out.println(taskMenu);
    }

    private void pressButton5() {
        TMenu = new LinkedHashMap<>();
        Leetspeak myEncoder = new Leetspeak();
        TMenu.put("1", " 1 - Leetspeak");
        System.out.println(" OOP tasks, choose one:");
        for (Object o : TMenu.values()) {
            System.out.println(o);
        }
        int choose = scanner.nextInt();
        System.out.println("Your task is - " + choose);
        taskMenu = new LinkedHashMap<>();
        taskMenu.put("1", myEncoder);

        if (taskMenu.containsKey(String.valueOf(choose))) {
            System.out.println("Enter values for " + TMenu.get(String.valueOf(choose)) + ": ");
            switch (String.valueOf(choose)) {
                case "1":
                    System.out.println((myEncoder
                            .encode(scanner.next()).equals(scanner.next()))
                            + " - solution !");
                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;

            }
        } else {
            System.out.println("Try again!");
            pressButton1();
        }

        for (Object o : TMenu.keySet()) {
            TMenu.remove(o);
            taskMenu.remove(o);
        }
        System.out.println(TMenu);
        System.out.println(taskMenu);
    }

    private void pressButton6() {
        TMenu = new LinkedHashMap<>();
        TMenu.put("1", " 1 - Reversed String");
        TMenu.put("2", " 2 - Banjo");
        TMenu.put("3", " 3 - FakeBinary");
        TMenu.put("4", " 4 - AllStarCodeChallenge");
        TMenu.put("5", " 5 - ExclamationMarks");
        System.out.println(" String tasks, choose one:");
        for (Object o : TMenu.values()) {
            System.out.println(o);
        }
        int choose = scanner.nextInt();
        System.out.println("Your task is - " + choose);
        taskMenu = new LinkedHashMap<>();
        taskMenu.put("1", new ReversedStrings());
        taskMenu.put("2", new Banjo());
        taskMenu.put("3", new FakeBinary());
        taskMenu.put("4", new AllStarCodeChallenge());
        taskMenu.put("5", new ExclamationMarks());


        if (taskMenu.containsKey(String.valueOf(choose))) {
            System.out.println("Enter values for " + TMenu.get(String.valueOf(choose)) + ": ");
            switch (String.valueOf(choose)) {
                case "1":
                    System.out.println(new ReversedStrings()
                            .solution(scanner.next())
                            + " - solution !");
                    break;
                case "2":
                    System.out.println(new Banjo()
                            .areYouPlayingBanjo(scanner.next())
                            + " - solution !");
                    break;
                case "3":
                    System.out.println(new FakeBinary()
                            .fakeBin(scanner.next())
                            + " - solution !");
                    break;
                case "4":
                    System.out.println(new AllStarCodeChallenge()
                            .strCount(scanner.next(), scanner.next().charAt(0))
                            + " - solution !");
                    break;
                case "5":
                    System.out.println(new ExclamationMarks()
                            .remove(scanner.next(), scanner.nextInt())
                            + " - solution !");
                    break;

            }
        } else {
            System.out.println("Try again!");
            pressButton1();
        }

        for (Object o : TMenu.keySet()) {
            TMenu.remove(o);
            taskMenu.remove(o);
        }
        System.out.println(TMenu);
        System.out.println(taskMenu);

    }

    private void pressButton7() {

        TMenu = new LinkedHashMap<>();
        TMenu.put("1", " 1 - Dictionary");
        System.out.println(" Collections tasks, choose one:");
        for (Object o : TMenu.values()) {
            System.out.println(o);
        }
        int choose = scanner.nextInt();
        System.out.println("Your task is - " + choose);
        taskMenu = new LinkedHashMap<>();
        taskMenu.put("1", new Dictionary());

        if (taskMenu.containsKey(String.valueOf(choose))) {
            System.out.println("Enter values for " + TMenu.get(String.valueOf(choose)) + ": ");
            switch (String.valueOf(choose)) {
                case "1":
                    Dictionary dictionary = new Dictionary();
                    dictionary.newEntry("Apple", "A fruit");
                    dictionary.newEntry("Soccer", "A sport");
                    System.out.println((new Dictionary().look(scanner.next()))
                            + " - solution !");
                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;

            }
        } else {
            System.out.println("Try again!");
            pressButton1();
        }

        for (Object o : TMenu.keySet()) {
            TMenu.remove(o);
            taskMenu.remove(o);
        }
        System.out.println(TMenu);
        System.out.println(taskMenu);
    }

    private void outputMenu() {
        System.out.println("\nMENU:");
        for (String str : menu.values()) {
            System.out.println(str);
        }
    }

    public void show() {
        String keyMenu;
        do {
            outputMenu();
            System.out.println("Please, select menu point.");
            keyMenu = scanner.nextLine().toUpperCase();
            try {
                methodsMenu.get(keyMenu).print();
            } catch (Exception ignored) {
            }
        } while (!keyMenu.equals("Q"));

    }


}
