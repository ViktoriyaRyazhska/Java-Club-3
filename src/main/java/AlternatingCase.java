import java.util.Scanner;

public class AlternatingCase extends Kata{
    String title = "altERnaTIng cAsE <=> ALTerNAtiNG CaSe";
    @Override
    public String getTitle() {
        return title;
    }
    public  String toAlternativeString(String string) {
        String[] s = string.split("");
        String str="";
        for(int i=0; i<s.length;i++){
            if(s[i].equals(s[i].toLowerCase())){
                str += s[i].toUpperCase();
            }else{
                str += s[i].toLowerCase();
            }
        }
        return str;
    }
    String getDetails(){
        String s = " Type 'e' to close this kata. \n" +
                "Details: \n" +
                " This kata takes a string and returns a string where \n" +
                " each lowercase letter becomes uppercase and each uppercase letter becomes lowercase. \n" +
                "Enter s string ( non-alphabetical characters are unaffected): ";
        return s;
    }

    @Override
    boolean isValueCorrect(String input) {
        if(input == null){
            return false;
        }
        if(input.equalsIgnoreCase("e")){
            return false;
        }

        return true;
    }

    @Override
    String main(String input) {
        return toAlternativeString(input);
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