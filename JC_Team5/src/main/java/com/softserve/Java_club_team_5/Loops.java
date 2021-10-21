package com.softserve.Java_club_team_5;

import java.util.Arrays;
import java.util.Optional;

public class Loops {

    //loop kata 1
    public String repeatString(int i,String str){
        String rep="";
        for(int j=i;j>0;j--){
            rep=rep.concat(str);
        }
        return rep;
    }

    //loop kata 2
    public String catDogYears(int hy){
        int dy = 0;
        int cy=0;
        for(int i=hy;i>0; i--){
            if(hy-i==0){
                dy=15;
                cy=15;
            }
            else if(hy-i==1){
                dy+=9;
                cy+=9;
            }
            else {
                cy += 4;
                dy += 5;
            }
        }
        return "Cat is "+cy+" y.o.; Dog is "+dy+" y.o.";
    }

    //loop kata 3
    public float mean(int a[]){
        int m=0;
        String s="{";
        for(int i:a){
            m=m+i;
            s=s.concat(","+i);
            System.out.println(m+";"+a.length);
        }
        s=s.concat("}");
        float f=(float) m/a.length;
        System.out.println("Your array is: "+s+" ; Mean of this array equals to: "+f+";");
        return f;
    }
    //loop kata 4
    public int[] map(int[] arr) {
        //return Arrays.stream(arr).map(x -> x * 2).toArray();
        for(int i = 0; i < arr.length; i ++)arr[i] *= 2;
        return arr;
    }
    //loop kata 5
    public int countSheeps(Boolean[] arrayOfSheeps) {
        return (int) Arrays.stream(arrayOfSheeps)
                .filter(x-> Optional.ofNullable(x).isPresent())
                .filter(x->x.equals(true))
                .count();
    }
    //loop kata 6
    public  int[] reverse(int n){
        int[]arr = new int[n];
        for(int i = n; i > 0;i--)arr[n-i]=i;
        return arr;
    }
}
