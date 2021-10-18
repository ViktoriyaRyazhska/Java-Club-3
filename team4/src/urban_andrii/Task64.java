package urban_andrii;

public class Task64 {
    public void strCount(String str, char letter) {

        int count = 0;
        char[] ls = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (letter == ls[i]) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}

