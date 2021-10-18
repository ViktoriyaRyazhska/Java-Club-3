import java.util.ArrayList;
import java.util.List;


public class CountingSheep extends Kata{
    String title = "Counting sheep...";
    @Override
    public String getTitle() {
        return title;
    }

    public int countSheeps(List<Boolean> arrayOfSheeps) {
            int n = 0;
            for(boolean b:arrayOfSheeps){
                if(b){
                    n++;
                }
            }
            return n;
        //return Arrays.stream(arrayOfSheeps).filter(x -> x != null).filter(x -> x == true).toArray().length;
        //return Collections.frequency(Arrays.asList(arrayOfSheeps), true);
    }
    String getDetails(){
        String s = " Type 'e' to close this kata \n" +
                " Consider an list of sheep where some sheep may be missing from their place. \n" +
                " This kata counts the number of sheep present in the array (true means present). \n" +
                "Enter a list of true( = present) or false( = not present) values \n" +
                "(it is forbidden to enter other letters or numbers except 'e'): ";
        return s;
    }

    @Override
    boolean isValueCorrect(String input) {
        String a = input.replace("," ," ");
        String q = "";
        String [] str = a.split("");
        for(String x: str){
            if(! x.equalsIgnoreCase(" ")){
                q += x;
            }
            if(x.equalsIgnoreCase("e")){
                q += " ";
            }
        }
        str = null;
        str = q.split(" ");
        for(int i =0; i < str.length;i++){
            String s = str[i];
            if(!s.equalsIgnoreCase("true")){
                if(!s.equalsIgnoreCase("false")){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    String main(String input) {
        List<Boolean> list = new ArrayList<>();
        String a = input.replace("," ," ");
        String q = "";
        String [] str = a.split("");
        for(String x: str){
            if(! x.equalsIgnoreCase(" ") && !isInteger(x)){
                q += x;
            }
            if(x.equalsIgnoreCase("e")){
                q += " ";
            }
        }
        str = null;
        str = q.split(" ");
        for(int i =0; i < str.length;i++){
            String z =str[i];
            list.add(Boolean.parseBoolean(z));
        }
        int n = countSheeps(list);
        return String.valueOf(n);
    }
    boolean isInteger(String s) {
        if(s == null){
            return false;
        }
        if(s.contains(",") || s.contains(".")){
            return false;
        }
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }
}
