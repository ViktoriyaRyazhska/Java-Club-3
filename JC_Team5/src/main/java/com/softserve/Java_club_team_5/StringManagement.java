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
    //string kata 5
    public static String replaceDots(final String str) {
        String str1 = new String();
        for(int i = 0; i < str.length();i++)
        {
            if(str.charAt(i)== '.'){str1 += '-';}
            else str1 += str.charAt(i);
        }
        return str1;
    }
    //string kata 6
    public static String areYouPlayingBanjo(String name) {
        if(name.toLowerCase().charAt(0) == 'r')return name + " plays banjo";
        else return name + " does not play banjo";
    }
    //string kata 7
    public static String noSpace(final String x) {
        String xx = new String();
        for(int i = 0; i < x.length(); i++)
            if(x.charAt(i) != ' ')xx += x.charAt(i);
        return xx;
    }
    //string kata 8
    public static String tripleTrouble(String one, String two, String three) {
        String result = new String();
        for(int i = 0; i < one.length();i++)
        {
            result += one.charAt(i);
            result += two.charAt(i);
            result += three.charAt(i);
        }
        return result;
    }
}
