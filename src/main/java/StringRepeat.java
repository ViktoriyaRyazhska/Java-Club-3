public class StringRepeat extends Kata{
    String title = "String repeat";
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    String getDetails() {
        String s = "Type 'e' to close this kata \n" +
                " This kata takes an integer 'n' and string and returns the string repated n times \n" +
                "Enter an integer and a string:";
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
                if(!str[i].equalsIgnoreCase(" ") && i!= (str.length -1)){
                    if(str[i+1].equalsIgnoreCase(" ")){
                        q += " ";
                    }
                }
            }
        }
        str = null;
        if(q.contains(" ")){
            str = q.split(" ");
            if(isInteger(str[0])){
                if(!str[1].equalsIgnoreCase("e")) {
                    return true;
                }
            }else{
                if(isInteger(str[1])){
                    if(!str[0].equalsIgnoreCase("e")) {
                        return true;
                    }
                }
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
        if(isInteger(str[0]) && !str[1].equalsIgnoreCase("e")){
                return String.valueOf(repeatStr(Integer.parseInt(str[0]), str[1]));
        }else{
            return String.valueOf(repeatStr(Integer.parseInt(str[1]), str[0]));
        }
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
    public  String repeatStr( int repeat,  String string) {
            String s ="";
            int n =repeat;
            while(n!=0){
                s += string;
                n--;
            }
            return s;
    }
}

