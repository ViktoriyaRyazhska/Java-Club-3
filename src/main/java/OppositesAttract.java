

public class OppositesAttract extends Kata{
    String title = "Opposites Attract";
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    String getDetails() {
        String s = " Type 'e' to close this kata \n" +
                "Timmy & Sarah think they are in love, but around where they live, \n" +
                "they will only know once they pick a flower each. \n" +
                "If one of the flowers has an even number of petals and \n" +
                "the other has an odd number of petals it means they are in love.\n" +
                "This kata takes the number of petals of each flower and returns true if they are in love and false if they aren't. \n" +
                " Enter two integers:";
        return s;
    }

    @Override
    boolean isValueCorrect(String input) {
        String a = input.replace("," ," ");
        String q = "";
        String [] str = a.split("");
        for(int i =0;i<str.length;i++){
            if(!str[i].equalsIgnoreCase(" ")){
                q += str[i];
                if(isInteger(str[i]) && i!= (str.length -1)){
                    if(str[i+1].equalsIgnoreCase(" ")){
                        q += " ";
                    }
                }

            }
        }
        str = null;
        if(q.contains(" ")){
            str = q.split(" ");
            if(isInteger(str[0]) && isInteger(str[1])){
                return true;
            }
        }
        return false;
    }

    @Override
    String main(String input) {
        String a = input.replace("," ," ");
        String q = "";
        String [] str = a.split("");
        for(int i =0;i<str.length;i++){
            if(!str[i].equalsIgnoreCase(" ")){
                q += str[i];
                if(isInteger(str[i]) && i!= (str.length -1)){
                    if(str[i+1].equalsIgnoreCase(" ")){
                        q += " ";
                    }
                }

            }
        }
        str = null;
        str = q.split(" ");
        return String.valueOf(isLove(Integer.parseInt(str[0]), Integer.parseInt(str[1])));
    }
    public  boolean isLove( int flower1,  int flower2) {
        if((flower1 % 2==0 && flower2 % 2!=0)||(flower2 % 2==0 && flower1 % 2!=0)){
            return true;
        }
        return false;
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
