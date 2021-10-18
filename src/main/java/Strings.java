import java.util.HashMap;
import java.util.Map;

public class Strings extends GroupOfKatas{
    String title = "Strings";
    private Map<Integer, Kata> stringsKatas = new HashMap<>();
    public Strings(){
        stringsKatas.put(1, new ConvertNumberToString());
        stringsKatas.put(2, new FIXMEReplaceAllDots());
        stringsKatas.put(3, new FindThePosition());
        stringsKatas.put(4, new AbbreviateTwoWordName());
        stringsKatas.put(5, new AlternatingCase());
    }

    @Override
    String getTitle() {
        return title;
    }
    String getKatas(){
        String s = "";
        s += "Choose a kata: \n ";
        for(var entry: stringsKatas.entrySet()){
            s += entry.getKey() + ") " + entry.getValue().getTitle() + "; \n ";
        }
        s += " 'e' - Exit this group of katas;";
        return s;
    }
    Kata getKata(int numberOfKata){
        return stringsKatas.get(numberOfKata);
    }
    boolean isNumberOfKataCorrect(int num){
        return  num>0 && num<= stringsKatas.size();
    }
    int getStringsSize(){
        return stringsKatas.size();
    }
}

