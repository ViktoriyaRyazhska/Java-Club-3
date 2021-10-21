package com.softserve.Java_club_team_5;


public class Conditions {

    //conditions kata 1
    public int returnNegative(int in){
        int j=0;
        if(in<0 || in>0){
            j=in*-1;
        }
        System.out.println(in+":"+j);
        return j;
    }

    //conditions kata 2
    public boolean indivisible(int n,int x,int y){
        if(n % x !=0 && n % y!=0){
            System.out.println("n="+n+"; x="+x+"; y="+y+": false because "+n+" is neither divisible by "+x+" nor "+y);
            return false;
        }
        else if(n% x!=0  )
        {
            System.out.println("n="+n+"; x="+x+"; y="+y+": false because "+n+" is not divisible by "+x);
            return false;
        }
        else if(n%y!=0){
            System.out.println("n="+n+"; x="+x+"; y="+y+": false because "+n+" is not divisible by "+y);
            return false;
        }
        else{
            System.out.println("n="+n+"; x="+x+"; y="+y+": true because "+n+" is  divisible by "+x+" and "+y);
            return true;
        }

    }

    //conditions kata 3
    public boolean convertBool(int n){
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
        return b;
    }

    //conditions kata 4
    public float bonuses(float salary,boolean bonuses){
        if(bonuses){
            salary=salary*10;
            System.out.println("Fat cat recieved his bonus, total salary="+salary+"\u00A3");
        }
        else{
            System.out.println("Unfortunatly no bonuses, total salary="+salary+"\u00A3");
        }
        return salary;
    }

    //conditions kata 5
    public String CalculateAge(int birth, int yearTo) {
        if(birth == yearTo)return "You were born this very year!";
        else if(birth > yearTo) return "You will be born in " + (birth - yearTo) +" year"+(birth - yearTo > 1? "s.":".");
        else return "You are "+(yearTo-birth) +" year"+(yearTo-birth > 1? "s":"")+" old.";
    }

    //conditions kata 6
    public  String rps(String p1, String p2) {
        if(p1 == p2)return "Draw!";
        else if((p1 == "rock" && p2 == "scissors") ||
                (p1 == "scissors" && p2 == "paper") ||
                (p1 == "paper" && p2 == "rock"))return "Player 1 won!";
        else return "Player 2 won!";
    }

    //conditions kata 7
    public int basicMath(String op, int v1, int v2)
    {
        switch (op){
            case "+":
                return v1 + v2;
            case "-":
                return v1 - v2;
            case "/":
                try{
                    float i;
                    i=v1 / v2;
                }
                catch (ArithmeticException e){
                    System.out.println("Your value is NaN");
                    return 0;

                }
                return v1 / v2;
            case "*":
                return v1 * v2;
        }
        return 0;
    }
    //conditions kata 8
    public  boolean isLove(final int flower1, final int flower2) {
        return flower1 != flower2 && flower1 % 2 != flower2 % 2;
    }

}
