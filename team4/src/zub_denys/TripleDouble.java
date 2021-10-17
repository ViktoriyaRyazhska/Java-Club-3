package zub_denys;

import java.util.Scanner;

public class TripleDouble {
    public static String tripleTrouble(String one, String two, String three) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter first string: ");
//        String one = sc.next();
//        System.out.print("\nEnter second string: ");
//        String two = sc.next();
//        System.out.print("\nEnter third string: ");
//        String three = sc.next();
        StringBuffer x = new StringBuffer();
        String[] allStrings = new String[]{one, two, three};

        for(int i = 0; i < one.length(); i++) {
            for (String s : allStrings) {
                x.append(s.charAt(i));
            }
        }
        return x.toString();
    }
}
