import java.util.Scanner;

public class YouCantCodeUnderPressureNo1 extends Kata{
    String title = "You can't code under pressure #1";
    @Override
    public String getTitle() {
        return title;
    }
    public  int doubleInteger(int i) {
        return i*2;
    }
    String getDetails(){
        String details = " Type 'e' to close this kata \n " +
                "Details:\n" +
                " This kata reeds an integer number, doubles and returns it.\n" +
                "\n Enter an integer number: ";
        return details;
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
        int n =  doubleInteger(Integer.parseInt(input));
        return  String.valueOf(n);
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
