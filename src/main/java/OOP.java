import java.util.HashMap;
import java.util.Map;

public class OOP extends GroupOfKatas{
    String title = "OOP";
    private Map<Integer, Kata> oOPKatas = new HashMap<>();
    public OOP(){
        oOPKatas.put(0, null);
    }

    @Override
    String getTitle() {
        return title;
    }
    String getKatas(){
        String s = "";
        s += "Choose a kata: \n ";
        if(null == getKata(0)){
            for(var entry: oOPKatas.entrySet()){
                s += entry.getKey() + ") " + "" + "; \n ";
            }
            s += " 'e' - Exit this group of katas;";
            return s;
        }
        for(var entry: oOPKatas.entrySet()){
            s += entry.getKey() + ") " + entry.getValue().getTitle() + "; \n ";
        }
        s += " 'e' - Exit this group of katas;";
        return s;
    }
    Kata getKata(int numberOfKata){
        return oOPKatas.get(numberOfKata);
    }
    boolean isNumberOfKataCorrect(int num){
        return  num>0 && num<= oOPKatas.size();
    }
    int getOOPKatasSize(){
        return oOPKatas.size();
    }
}
