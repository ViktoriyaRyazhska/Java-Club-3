package com.softserve.team1;

public class EnoughSpace {
    public static int enough(int cap, int on, int wait){
        return cap >= on + wait ? 0 : on + wait - cap;
    }
}
