import java.util.HashMap;
import java.util.Map;

public class Conditions extends GroupOfKatas{
    String title = "Conditions";
    private Map<Integer, Kata> conditionsKatas = new HashMap<>();
    public Conditions(){
        conditionsKatas.put(1, new DoIgetAbonus());
        conditionsKatas.put(2, new OppositesAttract());
    }

    @Override
    String getTitle() {
        return title;
    }
    String getKatas(){
        String s = "";
        s += "Choose a kata: \n ";
        for(var entry: conditionsKatas.entrySet()){
            s += entry.getKey() + ") " + entry.getValue().getTitle() + "; \n ";
        }
        s += " 'e' - Exit this group of katas;";
        return s;
    }
    Kata getKata(int numberOfKata){
        return conditionsKatas.get(numberOfKata);
    }
    boolean isNumberOfKataCorrect(int num){
        return  num>0 && num<= conditionsKatas.size();
    }
    int getConditionsKatasKatasSize(){
        return conditionsKatas.size();
    }
}
