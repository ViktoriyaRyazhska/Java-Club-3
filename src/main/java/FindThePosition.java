

public class FindThePosition extends Kata{
    String title = "Find the position!";
    @Override
    public String getTitle() {
        return title;
    }

    public  String position(char alphabet) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        return "Position of alphabet: "+ (s.indexOf(alphabet)+1);
    }
    String getDetails(){
        String s = " Type 'e' to close this kata \n" +
                "Details: \n" +
                " This kata  takes a letter and returns its position in the alphabet. \n" +
                "Enter your name(names full of numbers are forbidden):  ";
        return s;
    }

    @Override
    boolean isValueCorrect(String input) {
        String s = input.replace(" ", "");
        if(s.length()>1){
            return false;
        }
        if(isInteger(s)){
            return false;
        }
        return true;
    }

    @Override
    String main(String input) {
        char s = input.charAt(0);
        return position(s);
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