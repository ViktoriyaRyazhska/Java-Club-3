public class DoIgetAbonus extends Kata{
    String title = "Do I get a bonus?";
    @Override
    public String getTitle() {
        return title;
    }
    public  String bonusTime(int salary,  boolean bonus) {
        int a = salary;
        if(bonus) {
            a = a * 10;
        }
        return "£" + a;
    }
    @Override
    String getDetails() {
        String s = " Type 'e' to close this kata. \n" +
                "It's bonus time in the big city! \n" +
                "The fatcats are rubbing their paws in anticipation... but who is going to make the most money? \n" +
                "This kata takes two arguments: salary and bonus. Salary will be an integer, and bonus a boolean. \n" +
                "If bonus is true, the salary will be multiplied by 10. \n " +
                "If bonus is false, the fatcat did not make enough money and must receive only his stated salary. \n" +
                " Enter salary and bonus(use a whitespace or a comma to split two arguments):";
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
        str = q.split(" ");
        if(!isInteger(str[0])){
            return false;
        }
        if(!(str[1].equalsIgnoreCase("true") || str[1].equalsIgnoreCase("false"))){
            return false;
        }
        return true;
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
        int salary = Integer.parseInt(str[0]);
        boolean bonus = Boolean.parseBoolean(str[1]);
        return bonusTime(salary, bonus);
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

