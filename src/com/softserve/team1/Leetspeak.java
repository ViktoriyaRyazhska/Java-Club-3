package com.softserve.team1;

public class Leetspeak extends Encoder {
    public String encode(String source) {
        if (source.equals("")) {
            return "";
        }

        StringBuilder sb1 = new StringBuilder();
        char[] chArrOriginal = source.toCharArray();
        char[] chArrLower = source.toLowerCase().toCharArray();

        for (int i = 0; i < chArrLower.length; i++) {
            switch (chArrLower[i]) {
                case 'a':
                    sb1.append("4");
                    break;
                case 'e':
                    sb1.append("3");
                    break;
                case 'l':
                    sb1.append("1");
                    break;
                case 'm':
                    String str1 = "/^^'";
                    str1 = str1.replaceAll("'", "\\\\");
                    sb1.append(str1);
                    break;
                case 'o':
                    sb1.append("0");
                    break;
                case 'u':
                    sb1.append("(_)");
                    break;
                default:
                    sb1.append(chArrOriginal[i]);
            }
        }
        return sb1.toString();
    }
}

abstract class Encoder {
    public abstract String encode(String source);
}

//       a -> 4
//        e -> 3
//        l -> 1
//        m -> /^^\
//        o -> 0
//        u -> (_)
