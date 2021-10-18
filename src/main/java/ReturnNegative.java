

public class ReturnNegative extends Kata{
    String title = "Return Negative";
    @Override
    public String getTitle() {
        return title;
    }

        public  int makeNegative(int x) {
            return -Math.abs(x);
        }
        String getDetails(){
            String s = "Type 'e' to close this kata \n" +
                    " In this simple assignment you give an integer and the program has to make it negative. \n" +
                    " If the integer is negative, it is returned without changes \n" +
                    "Enter a number(letters are forbidden except 'e'): ";
            return s;
        }

    @Override
    boolean isValueCorrect(String input) {
        if(isInteger(input)){
            return true;
        }
        return false;
    }

    @Override
    String main(String input) {
        return String.valueOf(makeNegative(Integer.parseInt(input)));
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