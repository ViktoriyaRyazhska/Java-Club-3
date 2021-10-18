package com.softserve.team1.kata.impl;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class CatYearsDogYears extends BaseKata{

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears = 0;
        int dogYears = 0;
        int counter = humanYears;
        while (counter > 0) {
            if(counter == 2){
                catYears += 9;
                dogYears += 9;
                counter--;
            } else if( counter == 1){
                catYears += 15;
                dogYears += 15;
                counter--;
            } else {
                catYears += 4;
                dogYears += 5;
                counter--;
            }

        }
        System.out.println(humanYears);
        System.out.println(catYears);
        System.out.println(dogYears);
        return new int[]{humanYears, catYears, dogYears};
    }


    @Override
    public void test() {

    }


}
