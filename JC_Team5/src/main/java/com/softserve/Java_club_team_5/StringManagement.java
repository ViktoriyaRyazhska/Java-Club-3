package com.softserve.Java_club_team_5;



public class StringManagement {
    // string kata 1
    public void strTransform(int i) {
        String str;
        str = String.valueOf(i);
        System.out.println("Integer: " + i + " String: " + str);
    }

    //string kata 2
    public void strReverse(String str) {
        char[] ch = str.toCharArray();
        String out = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            out = out.concat(String.valueOf(ch[i]));
        }
        System.out.println(out);
    }

    //string kata 3
    public void sayHello(String []str ,String city){
            String text="Hello,";
            for (String m:str){
                text=text.concat(" "+m);
            }
            text=text.concat("! Welcome to "+city+"!");
            System.out.println(text);
        }


    //string kata 4
    public void strOpposite(String str){
        String s;
        if (str.contains("-")){
            s=str;
            s=s.replaceAll("-","");
        }
        else
        {
            s="-"+str;
        }
        System.out.println(str+" : "+s);
    }
}
