import java.util.Scanner;

public class ConvertNumberToString extends Kata{
    String title = "Convert a Number to a String!";
    @Override
    public String getTitle() {
        return title;
    }
    public  String numberToString(int num) {
        return Integer.toString(num);

    }
    String getDetails(){
        String s = " Type 'e' to close this kata \n" +
                "Details: \n" +
                " This kata takes a number and converts it into a string. \n" +
                "Enter your number: ";
        return s;
    }

    @Override
    boolean isValueCorrect(String input) {
        if(!isInteger(input)){
            return false;
        }
        return true;
    }

    @Override
    String main(String input) {
        int n = Integer.parseInt(input);
        return  numberToString(n);
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