import java.util.HashMap;
import java.util.Map;

public class Classes extends  GroupOfKatas{
    String title = "Classes";
    private Map<Integer, Kata> classesKatas = new HashMap<>();
    public Classes(){
        classesKatas.put(1, new FIXMEStaticElectrickery());
    }

    @Override
    String getTitle() {
        return title;
    }
    String getKatas(){
        String s = "";
        s += "Choose a kata: \n ";
        for(var entry: classesKatas.entrySet()){
            s += entry.getKey() + ") " + entry.getValue().getTitle() + "; \n ";
        }
        s += " 'e' - Exit this group of katas;";
        return s;
    }
    Kata getKata(int numberOfKata){
        return classesKatas.get(numberOfKata);
    }
    boolean isNumberOfKataCorrect(int num){
        return  num>0 && num<= classesKatas.size();
    }
    int getClassesKatasSize(){
        return classesKatas.size();
    }
}
