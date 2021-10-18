package zub_denys;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InfiniteLoop {
    public static List createList(int number) {
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();

        List list = new ArrayList();

        for(int count = 1; count <= number;count ++)
        {
            list.add(count);
        }

        return list;
    }
}
