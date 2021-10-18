import java.util.*;

public class FilteringEvenNumbers extends Kata{
    String title = "Filtering even numbers";
    @Override
    public String getTitle() {
        return title;
    }
    public  List<Integer> filterOddNumber(List<Integer> listOfNumbers){
        List<Integer> num = new LinkedList<>();
        for(int i=0;i<listOfNumbers.size();i++){
            if(!((listOfNumbers.get(i))%2==0)){
                num.add(listOfNumbers.get(i));
            }
        }
        return num;
        //return listOfNumbers.stream().filter(l -> l%2 != 0).collect(Collectors.toList());
    }
    String getDetails(){
        String s = " Type 'e' to close this kata \n" +
                "Details: \n" +
                " The kata removes even numbers from the list and returns a list that contains the odd numbers. \n" +
                "Enter a list of integers(it is forbidden to enter letters or strings except 'e'): ";
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
                if(isInteger(str[i]) && i!= (str.length -1)){
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
        num = filterOddNumber(num);
        String res = "";
        for(Integer x: num){
           res += String.valueOf(x) + " ";
        }
        return res;
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
