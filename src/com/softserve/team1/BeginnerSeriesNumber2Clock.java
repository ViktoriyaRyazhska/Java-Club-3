package com.softserve.team1;

public class BeginnerSeriesNumber2Clock {
    public static int Past(int h, int m, int s)
    {
        if( h < 0 || h > 23 || m < 0 || m > 59 || s < 0 || s > 59 )
            return -1;

        return h*3600000 + m*60000 + s*1000;
    }
}
