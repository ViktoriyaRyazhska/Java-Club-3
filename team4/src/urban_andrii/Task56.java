package urban_andrii;

public class Task56 {
    public static String areYouPlayingBanjo() {
        String name = "Tom";
        char[] a = name.toCharArray();
        if (a[0] =='R'||  a[0]=='r')
        {
            return name + " plays banjo";
        }
        else{
            return name + " does not play banjo";
        }
        // Program me!
    }
}

