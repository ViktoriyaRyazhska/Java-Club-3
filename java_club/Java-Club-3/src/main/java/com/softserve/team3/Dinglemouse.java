package com.softserve.team3;

public class Dinglemouse {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int[] years = new int[]{humanYears, 15, 15};
        for (int i = 1; i < humanYears; i++) {
            if(i>1){
                years[1] +=4;
                years[2] +=5;
            }else{
                years[1] +=9;
                years[2] +=9;
            }
        }
        return years;
    }
}
