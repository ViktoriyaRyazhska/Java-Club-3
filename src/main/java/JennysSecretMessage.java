public class JennysSecretMessage extends Kata{
    String title = "Jenny's secret message";
    @Override
    public String getTitle() {
        return title;
    }
    public  String greet(String name) {
        if(name.equals("Johnny")){
            return "Hello, my love!";
        }
        return "Hello, " + name + "!";
    }
    @Override
    String main(String input) {
        return greet(input);
    }
    String getDetails(){
        String details = " Type 'e' to close this kata. \n" +
                "Details:\n" +
                " Jenny has written a function that returns a greeting for a user. \n " +
                " However, she's in love with Johnny, and would like to greet him slightly different. \n" +
                 "Enter your name(names full of numbers are forbidden): ";
        return details;
    }
    boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }
    public boolean isValueCorrect(String input){
        if(isInteger(input)){
            return false;
        }
        if(input.equalsIgnoreCase("e")){
            return false;
        }
        return true;
    }

}