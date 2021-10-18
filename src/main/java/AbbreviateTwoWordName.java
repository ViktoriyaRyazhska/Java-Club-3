
public class AbbreviateTwoWordName extends Kata{
    String title = "Abbreviate a Two Word Name";
    @Override
    public String getTitle() {
        return title;
    }
    public  String abbrevName(String name) {
        name = name.replaceAll(" ", " ");
        String [] s = name.split(" ");
        String res = "";
        for(String str: s){
            res += str.charAt(0) +".";
        }
        return res;
    }
    String getDetails(){
        String s = " Type 'e' to close this kata \n" +
                "Details:\n" +
                " This kata  takes a two word name and converts into initials. \n" +
                "\nEnter your name(names full of numbers are forbidden): ";
        return s;
    }

    @Override
    boolean isValueCorrect(String input) {
        if(isInteger(input) || input.equalsIgnoreCase("e")){
            return false;
        }else{
            return true;
        }
    }

    @Override
    String main(String input) {
        return abbrevName(input);
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