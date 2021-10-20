package com.softserve.Java_club_team_5;


import java.util.ArrayList;
import java.util.List;

public class Collections {
    //collection kata 2
    public static List CreateList(int number)
    {
        List list = new ArrayList();

        for(int count = 1; count <= number; count++)
        {
            list.add(count);
        }

        return list;
    }
}
