import java.util.HashMap;
import java.util.Map;

public class BasicPrograms extends GroupOfKatas{
    String title = "Basic programs";
    private Map<Integer, Kata> basicProgramsKatas = new HashMap<>();
    public BasicPrograms(){
        basicProgramsKatas.put(1, new YouCantCodeUnderPressureNo1());
        basicProgramsKatas.put(2, new JennysSecretMessage());
        basicProgramsKatas.put(3, new ReturnNegative());
    }

    @Override
    String getTitle() {
        return title;
    }
    String getKatas(){
        String s = "";
        s += "Choose a kata: \n ";
        for(var entry: basicProgramsKatas.entrySet()){
            s += entry.getKey() + ") " + entry.getValue().getTitle() + "; \n ";
        }
        s += " 'e' - Exit this group of katas;";
        return s;
    }
    Kata getKata(int numberOfKata){
        return basicProgramsKatas.get(numberOfKata);
    }
    boolean isNumberOfKataCorrect(int num){
        return  num>0 && num<= basicProgramsKatas.size();
    }
    int getBasicProgramsKatasSize(){
        return basicProgramsKatas.size();
    }
}
