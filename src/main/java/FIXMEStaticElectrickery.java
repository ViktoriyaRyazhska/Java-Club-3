public class FIXMEStaticElectrickery extends Kata {
    String title = "Static electrickery";
    @Override
    public String getTitle () {
        return title;
    }

    @Override
    String getDetails() {
        String s = " Type 'e' to close this kata \n" +
                "Details: \n" +
                " This kata takes an integer and returns it incremented by 100. \n" +
                "Enter an integer:  ";
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
        return String.valueOf(plus100(Integer.parseInt(input)));
    }
    public int plus100(int n) {
        return 100 + n;
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