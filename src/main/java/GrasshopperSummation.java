
public class GrasshopperSummation extends Kata{
    String title = "Grasshopper - Summation";
    @Override
    public String getTitle() {
        return title;
    }
    public  int summation(int n) {
        int sum = 0;
        do{
            sum += n;
            n--;
        }while(n!=0);
        return sum;
    }
    String getDetails(){
        String s = "Type 'e' to close this kata \n" +
                " This kata takes an integer 'n' that is greater than 0 \n" +
                " and returns the summation of every number from 1 to n . \n " +
                " The number will always be a positive integer greater than 0. \n" +
                "Enter an integer 'n': ";
        return s;
    }

    @Override
    boolean isValueCorrect(String input) {
        if(isInteger(input)){
            if(Integer.parseInt(input) >0){
                return true;
            }
        }
        return false;
    }

    String main(String input) {
        return String.valueOf(summation(Integer.parseInt(input)));
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
