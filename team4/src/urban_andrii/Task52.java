package urban_andrii;

public class Task52 {
    public static String solution(String str) {
        String nstr = "";
        for (int i=0; i<str.length(); i++)
        {
            char c= str.charAt(i);
            nstr= c+nstr;
        }
        return nstr;
    }

}

