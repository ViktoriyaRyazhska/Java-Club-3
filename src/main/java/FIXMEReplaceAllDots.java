

public class FIXMEReplaceAllDots extends Kata{
    String title = "Replace all dots";
    @Override
    public String getTitle() {
        return title;
    }
    public  String replaceDots(String str) {
        return str.replace(".", "-");
    }
    String getDetails(){
        String s = " Type 'e' to close this kata \n" +
                "Details: \n" +
                " This kata takes a string and  replaces all the dots '.'  with dashes '-'. \n" +
                " If there is no dots in a string, it returns the string without changes \n" +
                "Enter your string: ";
        return s;
    }

    @Override
    boolean isValueCorrect(String input) {
        if(input.equalsIgnoreCase("e")){
            return false;
        }
        return true;
    }

    @Override
    String main(String input) {
        return replaceDots(input);
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