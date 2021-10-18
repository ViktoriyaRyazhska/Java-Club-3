package com.softserve.Java_club_team_5;


public class Conditions {

    //conditions kata 1
    public void returnNegative(int in){
        int j=0;
        if(in<0 || in>0){
            j=in*-1;
        }

        System.out.println(in+":"+j);

    }

    //conditions kata 2
    public void indivisible(int n,int x,int y){
        if(n % x !=0 && n % y!=0){
            System.out.println("n="+n+"; x="+x+"; y="+y+": false because "+n+" is neither divisible by "+x+" nor "+y);
        }
        else if(n% x!=0  )
        {
            System.out.println("n="+n+"; x="+x+"; y="+y+": false because "+n+" is not divisible by "+x);
        }
        else if(n%y!=0){
            System.out.println("n="+n+"; x="+x+"; y="+y+": false because "+n+" is not divisible by "+y);
        }
        else{
            System.out.println("n="+n+"; x="+x+"; y="+y+": true because "+n+" is  divisible by "+x+" and "+y);
        }

    }

    //conditions kata 3
    public void convertBool(int n){
        boolean b;
        String str;
        if (n==1){
            b=true;
        }
        else{
            b=false;

        }
        str=String.valueOf(b);
        System.out.println(str);
    }

    //conditions kata 4
    public void bonuses(float salary,boolean bonuses){
        if(bonuses){
            salary=salary*10;
            System.out.println("Fat cat recieved his bonus, total salary="+salary+"\u00A3");
        }
        else{
            System.out.println("Unfortunatly no bonuses, total salary="+salary+"\u00A3");
        }

    }

    //conditions kata 5

}
