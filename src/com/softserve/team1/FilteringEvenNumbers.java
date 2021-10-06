package com.softserve.team1;

import java.util.*;

public class FilteringEvenNumbers {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers)
    {
        listOfNumbers.removeIf(i -> i%2 == 0);

        return listOfNumbers;
    }
}
