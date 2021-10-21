package com.softserve.Java_club_team_5;



public class StringManagement {
    // string kata 1
    public String strTransform(int i) {
        String str;
        str = String.valueOf(i);
        System.out.println("Integer: " + i + " String: " + str);
        return str;
    }

    //string kata 2
    public String strReverse(String str) {
        char[] ch = str.toCharArray();
        String out = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            out = out.concat(String.valueOf(ch[i]));
        }
        System.out.println(out);
        return out;
    }

    //string kata 3
    public String sayHello(String []str ,String city){
            String text="Hello,";
            for (String m:str) text = text.concat(" " + m);
            text=text.concat("! Welcome to "+city+"!");
            System.out.println(text);
            return text;
        }


    //string kata 4
    public String strOpposite(String str){
        String s;
        if (str.contains("-")){
            s=str;
            s=s.replaceAll("-","");
        }
        else s="-"+str;
        System.out.println(str+" : "+s);
        return s;
    }

    //string kata 5
    public String replaceDots(final String str) {
        String str1 = "";
        for(int i = 0; i < str.length();i++)
        {
            if(str.charAt(i)== '.'){str1 += '-';}
            else str1 += str.charAt(i);
        }
        return str1;
    }
    //string kata 6
    public  String areYouPlayingBanjo(String name) {
        if(name.toLowerCase().charAt(0) == 'r')return name + " plays banjo";
        else return name + " does not play banjo";
    }

    //string kata 7
    public String noSpace(final String x) {
        String xx = "";
        for(int i = 0; i < x.length(); i++)
            if(x.charAt(i) != ' ')xx += x.charAt(i);
        return xx;
    }

    //string kata 8
    public  String tripleTrouble(String one, String two, String three) {
        String result = "";
        for(int i = 0; i < one.length();i++)
        {
            result += one.charAt(i);
            if(i<two.length()) {
                result += two.charAt(i);
            }
            if(i<three.length()) {
                result += three.charAt(i);
            }
        }
        return result;
    }
}
