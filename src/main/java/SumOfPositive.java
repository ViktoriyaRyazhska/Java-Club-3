import java.util.*;

public class SumOfPositive extends Kata{
    String title = "Sum of positive";
    @Override
    public String getTitle() {
        return title;
    }
    public  int sum(List <Integer> arr){
        int res = 0;
        if(arr!=null && arr.size()!=0){
            int s = 0;
            for(int a: arr){
                if(a>0){
                    s += a;
                }
            }
            res = s;
        }
        return res;
        //return Arrays.stream(arr).filter(v -> v > 0).sum();
    }
    String getDetails(){
        String s = "Type 'e' to close this kata \n" +
                "Details: \n" +
                " This kata  takes a list of integers and returns the sum of all of the positives ones. \n" +
                "Enter integers(it is forbidden to enter letters or strings except 'e'): ";
        return s;
    }

    @Override
    boolean isValueCorrect(String input) {
        String a = input.replace("," ," ");
        String q = "";
        String [] str = a.split("");
        for(int i =0;i<str.length;i++){
            if(!str[i].equalsIgnoreCase(" ")){
                q += str[i];
                if(i!= (str.length -1)){
                    if(str[i+1].equalsIgnoreCase(" ")){
                        q += " ";
                    }
                }

            }
        }
        str = null;
        str = q.split(" ");
        for(String x: str){
            if(!isInteger(x)){
                return false;
            }
        }
        return true;
    }

    @Override
    String main(String input) {
        String a = input.replace("," ," ");
        String q = "";
        String [] str = a.split("");
        for(int i =0;i<str.length;i++){
            if(!str[i].equalsIgnoreCase(" ")){
                q += str[i];
                if(i!= (str.length -1)){
                    if(str[i+1].equalsIgnoreCase(" ")){
                        q += " ";
                    }
                }

            }
        }
        str = null;
        str = q.split(" ");
        List<Integer> num = new LinkedList<>();
        for(String x: str){
            num.add(Integer.parseInt(x));
        }
        return String.valueOf(sum(num));
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
