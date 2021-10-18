import java.util.*;

public class View {
    private Map<Integer, GroupOfKatas> groupsOfKatas = new HashMap<>();
    public View(){
        groupsOfKatas.put(1, new BasicPrograms());
        groupsOfKatas.put(2, new Classes());
        groupsOfKatas.put(3, new Conditions());
        groupsOfKatas.put(4, new Loops());
        groupsOfKatas.put(5, new OOP());
        groupsOfKatas.put(6, new Strings());
        groupsOfKatas.put(7, new Collections());
    }
    Scanner scan = new Scanner(System.in);

    public void show() {
        while (true) {
            System.out.println(getInstruction());
            String numberOfGroup = scan.next();
            boolean flag = false;
            if(!flag){
               flag = isInteger(numberOfGroup) && isNumberOfGroupCorrect(numberOfGroup) ;
               if(!flag){
                   System.out.println("Incorrect value, try again ");
               }
            }
            if(flag){
                int num = Integer.parseInt(numberOfGroup);
                getGroupOfKatas(num);
            }
        }
    }

    boolean getGroupOfKatas(int numberOfGroup){
        boolean breakGroup = false;
        GroupOfKatas gok = groupsOfKatas.get(numberOfGroup);
        System.out.println(gok.getKatas());
        while(!breakGroup){
            boolean flag = false;
            String numberOfKata = scan.next();
            if(!flag){
                if(!numberOfKata.equalsIgnoreCase("e")){
                    if(isInteger(numberOfKata) && gok.isNumberOfKataCorrect(Integer.parseInt(numberOfKata))){
                        flag = true;
                    }else{
                        System.out.println("Incorrect value, try again ");
                    }
                }else{
                    breakGroup = true;
                }
            }
            if(flag){
                int number = Integer.parseInt(numberOfKata);
                getKata(gok, number);
            }
        }
        return breakGroup;
    }
    boolean getKata(GroupOfKatas gok, int numberOfKata){
        Kata k = gok.getKata(numberOfKata);
        System.out.println(k.getDetails());
        boolean breakKata = false;
        while(!breakKata) {
            boolean flag = false;
            String s = scan.nextLine();
            if(!flag){
                if(!s.equalsIgnoreCase("e")){
                    if(k.isValueCorrect(s)){
                        flag = true;
                    }else{
                        System.out.println("Incorrect value, try again ");
                    }
                }else{
                    breakKata = true;
                }
            }
            if(flag){
               String result = k.main(s);
               System.out.println(result);
            }
        }
        return breakKata;
    }
    String getInstruction(){
        String s = "";
        s += "Choose a group of katas: \n  ";
        for(var entry: groupsOfKatas.entrySet()){
            s += entry.getKey() + ") " + entry.getValue().getTitle() + "; \n  ";
        }
        return s;
    }
    boolean isNumberOfGroupCorrect(String s){
        if(this.isInteger(s)){
            int numberOfGroup = Integer.parseInt(s);
            if(numberOfGroup > 0 && numberOfGroup < 8){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    boolean isInteger(String s) {
        if(s == null){
            return false;
        }
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        } catch(NullPointerException e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }

}
/*public class SwitchItUp extends Kata{
    String title = "Switch it Up!";
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    String getDetails() {
        return null;
    }

    @Override
    boolean isValueCorrect(String input) {
        return false;
    }

    @Override
    String main(String input) {
        return null;
    }

}*/
/*public class AgeRangeCompatibilityEquation extends Kata{
    String title = "Age Range Compatibility Equation";
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void start() {
        System.out.println("This kata is temporary unavaible");
    }
}*/
/*public class BeginnerSeriesNo2Clock extends Kata{
    String title = "Beginner Series #2 Clock";
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void start() {
        System.out.println("This kata is temporary unavaible");

    }
}*/
/*public class BuildingBlocks extends Kata{
    String title = "Building blocks";
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void start() {
        System.out.println("This kata is temporary unavaible");

    }
}*/
/*public class CenturyFromYear extends Kata{
    String title = "Century From Year";
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void start() {
        System.out.println("This kata is temporary unavaible");

    }
}*/
/*public class ConvertToBinary extends Kata{
    String title = "Convert to Binary";
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void start() {
        System.out.println("This kata is temporary unavaible");

    }
}*/
/*public class Function3multiplyingTwoNumbers extends Kata{
    String title = "Function 3 - multiplying two numbers";
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void start() {
        System.out.println("This kata is temporary unavaible");

    }
}*/
/*public class GrasshopperDebug extends Kata{
    String title = "Grasshopper - Debug";
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void start() {
        System.out.println("This kata is temporary unavaible");

    }
}*/
/*public class ThinkfulNumberВrillsPixelartPlanning extends Kata{
    String title = "Thinkful - Number Drills: Pixelart planning";
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void start() {
        System.out.println("This kata is temporary unavaible");

    }
}*/
/*public class VolumeOfCuboid extends Kata{
    String title = "Volume of a Cuboid";
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void start() {
        System.out.println("This kata is temporary unavaible");

    }
}*/