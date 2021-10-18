import java.util.HashMap;
import java.util.Map;

public class Loops extends GroupOfKatas{
    String title = "Loops";
    private Map<Integer, Kata> loopsKatas = new HashMap<>();
    public Loops(){
        loopsKatas.put(1, new StringRepeat());
        loopsKatas.put(2, new CountingSheep());
        loopsKatas.put(3, new SumOfPositive());
        loopsKatas.put(4, new GrasshopperSummation());
    }

    @Override
    String getTitle() {
        return title;
    }
    String getKatas(){
        String s = "";
        s += "Choose a kata: \n ";
        for(var entry: loopsKatas.entrySet()){
            s += entry.getKey() + ") " + entry.getValue().getTitle() + "; \n ";
        }
        s += " 'e' - Exit this group of katas;";
        return s;
    }
    Kata getKata(int numberOfKata){
        return loopsKatas.get(numberOfKata);
    }
    boolean isNumberOfKataCorrect(int num){
        return  num>0 && num<= loopsKatas.size();
    }
    int getLoopsKatasKatasSize(){
        return loopsKatas.size();
    }
}