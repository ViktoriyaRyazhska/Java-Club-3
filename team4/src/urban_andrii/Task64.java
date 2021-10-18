package urban_andrii;

public class Task64 {
    public static int strCount(String str, char letter) {

        int count = 0;
        char[] ls = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (letter == ls[i]) {
                count += 1;
            }
        }
        return count;
    }
}

