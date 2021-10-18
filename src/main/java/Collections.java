import java.util.HashMap;
import java.util.Map;

public class Collections extends GroupOfKatas{
    String title = "Collections";
    private Map<Integer, Kata> collectionsKatas = new HashMap<>();
    public Collections(){
        collectionsKatas.put(1, new FilteringEvenNumbers());
    }

    @Override
    String getTitle() {
        return title;
    }
    String getKatas(){
        String s = "";
        s += "Choose a kata: \n ";
        for(var entry: collectionsKatas.entrySet()){
            s += entry.getKey() + ") " + entry.getValue().getTitle() + "; \n ";
        }
        s += " 'e' - Exit this group of katas;";
        return s;
    }
    Kata getKata(int numberOfKata){
        return collectionsKatas.get(numberOfKata);
    }
    boolean isNumberOfKataCorrect(int num){
        return  num>0 && num<= collectionsKatas.size();
    }
    int getCollectionsKatasSize(){
        return collectionsKatas.size();
    }
}
