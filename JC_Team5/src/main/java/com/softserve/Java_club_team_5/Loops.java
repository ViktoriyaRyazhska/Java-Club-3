package com.softserve.Java_club_team_5;

public class Loops {

    //loop kata 1
    public void repeatString(int i,String str){
        for(int j=i;j>0;j--){
                System.out.println(str);
        }
    }

    //loop kata 2
    public void catDogYears(int hy){
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
        System.out.println("Cat is "+cy+" y.o.; Dog is "+dy+" y.o.");
    }

    //loop kata 3
    public void mean(int a[]){
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
    }
}
