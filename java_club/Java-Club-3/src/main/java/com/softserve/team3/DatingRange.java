package com.softserve.team3;

public class DatingRange {
    public static String datingRange(int age) {
        int min ,max;
        min= (age/2)+7;
        max = (age-7)*2;
        if(age<=14){
            min = (int)(age - 0.10 * age);
            max =(int) (age + 0.10 * age);
        }
        return min+"-"+max;
    }
}
